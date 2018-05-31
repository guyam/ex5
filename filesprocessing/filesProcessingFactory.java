package filesprocessing;

import java.io.*;
import java.util.*;

public class filesProcessingFactory {

    // Constants //
    private final String FILTER = "FILTER";
    private final String ORDER = "ORDER";
    private final int FILTER_CONST = 1;
    private final int filter_CONST = 2;
    private final int ORDER_CONST = 3;
    private final int order_CONST = 4;
    private final String ORDER_DEFAULT = "abs";
    private final String sourceDir;

    private Filterable[] filterList;
    private Orderable[] orderList;

    private ArrayList<String> filterNameList = new ArrayList<String>();

    private ArrayList<String> orderNameList = new ArrayList<String>();

    private ArrayList<String> commandsList = new ArrayList<String>();

    private final File[] filesList;

    private filesProcessingFactory(String sourceDir, String commandFile){
        this.sourceDir = sourceDir;
        File sourceDirectory = new File(sourceDir);
        filesList = sourceDirectory.listFiles();
        try (FileReader commandFileReader = new FileReader(commandFile);
             BufferedReader commandFileBuffer = new BufferedReader(commandFileReader);) {
            String singleLineInCommandFile = null;
            while ((singleLineInCommandFile = commandFileBuffer.readLine()) != null) {
                commandsList.add(singleLineInCommandFile);
            }
        }
        catch (IOException e) {} // HANDLE THIS!!!
        for (int i = 0; i < commandsList.size(); i++){
            String[] sectionArgs = new String[4];
            sectionArgs[0] = commandsList.get(i);
            sectionArgs[1] = commandsList.get(i+1);
            sectionArgs[2] = commandsList.get(i+2);
            sectionArgs[3] = commandsList.get(i+3);
            String[] newSectionArgs = createSection(sectionArgs);
            i = i + goToNextSection(commandsList.get(i+3));
            filterNameList.add(newSectionArgs[0]);
            orderNameList.add(newSectionArgs[1]);
        }



    }

    private String[] createSection(String[] sectionArgs){
        String[] newSection = new String[2];
        newSection[1] = sectionArgs[order_CONST];
        newSection[0] = sectionArgs[filter_CONST];
        if (!FILTER.equals(sectionArgs[FILTER_CONST]))
            throw new NullPointerException(); // WRITE OUR OWN EXCEPTION
        if (!ORDER.equals(sectionArgs[ORDER_CONST]))
            throw new NullPointerException(); // WRITE OUR OWN EXCEPTION

        if ((FILTER.equals(sectionArgs[order_CONST])) || (sectionArgs[order_CONST] == null)){
            newSection[1] = ORDER_DEFAULT;
        }
        return newSection;
    }

    private int goToNextSection(String lastArgInSection){
        if ((lastArgInSection == null) || (lastArgInSection.equals(FILTER)))
            return 3;
        else
            return 4;
    }

    private void initializeFilter(String filterName){
        return;
    }

    private void initializeOrder(String orderName){
        return;
    }
}
