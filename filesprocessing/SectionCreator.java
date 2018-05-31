package filesprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class SectionCreator {

    private static final String FILTER = "FILTER";
    private static final String ORDER = "ORDER";
    private static final String ORDER_DEFAULT = "abs";
    private final int FILTER_CONST = 0;
    private final int filter_CONST = 1;
    private final int ORDER_CONST = 2;
    private final int order_CONST = 3;
    private static final int SHORT_SECTION_CONST = 3;
    private static final int LONG_SECTION_CONST = 4;

    private final ArrayList<String> commandsList;

    private ArrayList<String> sectionNameList = null;

    private ArrayList<Integer> sectionIndexList = null;

    private ArrayList<Section> sectionList = null;

    public SectionCreator(ArrayList<String> commandsList){
        this.commandsList = commandsList;

        parseSections();
        createSectionList();
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

    private void parseSections(){
        for (int i = 0; i < commandsList.size(); i++) {
            String[] sectionArgs = new String[4];
            sectionArgs[0] = commandsList.get(i + FILTER_CONST);
            sectionArgs[1] = commandsList.get(i + filter_CONST);
            sectionArgs[2] = commandsList.get(i + ORDER_CONST);
            sectionArgs[3] = commandsList.get(i + order_CONST);
            String[] newSectionArgs = createSection(sectionArgs);
            sectionNameList.add(newSectionArgs[0]);
            sectionNameList.add(newSectionArgs[1]);
            if (goToNextSection(commandsList.get(i + order_CONST)) == SHORT_SECTION_CONST){
                sectionIndexList.add(i + filter_CONST);
                sectionIndexList.add(-1);
                i = i + SHORT_SECTION_CONST;
            } else if (goToNextSection(commandsList.get(i + order_CONST)) == LONG_SECTION_CONST) {
                sectionIndexList.add(i + filter_CONST);
                sectionIndexList.add(i + order_CONST);
                i = i + LONG_SECTION_CONST;
            } else
                System.out.println("Part that should not be reached in parseSections reached");
        }
    }

    private int goToNextSection(String lastArgInSection){
        if ((lastArgInSection == null) || (lastArgInSection.equals(FILTER)))
            return SHORT_SECTION_CONST;
        else
            return LONG_SECTION_CONST;
    }

    private void createSectionList(){
        for (int i = 0; i < sectionNameList.size(); i++){
            int[] sectionIndexes = new int[2];
            sectionIndexes[0] = sectionIndexList.get(i); sectionIndexes[1] = sectionIndexList.get(i + 1);
            String[] sectionNames = new String[2];
            sectionNames[0] = sectionNameList.get(i); sectionNames[1] = sectionNameList.get(i + 1);
            Section newSection = new Section(sectionNames, sectionIndexes);
            sectionList.add(newSection);
            i = i + 2;
        }
    }

    public ArrayList<Section> getSectionList(){
        return sectionList;
    }
}
