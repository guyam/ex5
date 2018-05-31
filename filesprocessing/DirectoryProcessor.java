package filesprocessing;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DirectoryProcessor {

    private static final String FILTER = "FILTER";
    private static final String ORDER = "ORDER";
    private static final int FILTER_CONST = 1;
    private static final int filter_CONST = 2;
    private static final int ORDER_CONST = 3;
    private static final int order_CONST = 4;
    private static final int SHORT_SECTION_CONST = 3;
    private static final int LONG_SECTION_CONST = 4;
    private static final String ORDER_DEFAULT = "abs";

    private Filterable[] filterList;
    private Orderable[] orderList;

    private static ArrayList<Section> sectionNameList;

    private static ArrayList<String> commandsList = new ArrayList<String>();

    private static File[] filesList;

    public static void main(String[] args) {
        String sourceDir = args[0];
        File sourceDirectory = new File(sourceDir);
        filesList = sourceDirectory.listFiles();
        try (FileReader commandFileReader = new FileReader(args[1]);
             BufferedReader commandFileBuffer = new BufferedReader(commandFileReader);) {
            String singleLineInCommandFile;
            while ((singleLineInCommandFile = commandFileBuffer.readLine()) != null) {
                commandsList.add(singleLineInCommandFile);
            }
        } catch (IOException e) { } // HANDLE THIS!!!

        SectionCreator sectionCreator = new SectionCreator(commandsList);
        sectionNameList = sectionCreator.getSectionList();

        generateSections();
    }

    private static void generateSections(){
        for (Section section:sectionNameList){
            NameAndIndexWrapper WrappedFilter = new NameAndIndexWrapper(section.getFilterName(),
                                                                        section.getFilterIndex());
            FilterableFactory filterFactory = new FilterableFactory(WrappedFilter);
            FilterAndWarningWrapper filterAndWarning = filterFactory.generateFilter();
            NameAndIndexWrapper WrappedOrder = new NameAndIndexWrapper(section.getOrderName(),
                    section.getOrderIndex());
            OrderableFactory orderFactory = new OrderableFactory(WrappedOrder);
            OrderAndWarningWrapper orderAndWarning = orderFactory.generateOrder();
            if (filterAndWarning.getWarning() != null)
                System.out.println(filterAndWarning.getWarning());
            if (orderAndWarning.getWarning() != null)
                System.out.println(orderAndWarning.getWarning());
            ArrayList<File> filteredFiles = filterAndWarning.getFilter().filter(filesList);
            ArrayList<String> filteredAndOrderedFiles = orderAndWarning.getOrder().order(filteredFiles);
            for (String fileName:filteredAndOrderedFiles){
                System.out.println(fileName);
            }
        }
    }

}
