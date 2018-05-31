package filesprocessing;

import java.util.ArrayList;

public class Section {
    
    // Constants //
    private final int ORDER = ORDER;
    private final int FILTER = FILTER;

    int[] sectionIndexes;

    String[] sectionArguments;

    Section(String[] sectionArguments, int[] sectionIndexes){
        this.sectionArguments = sectionArguments;
        this.sectionIndexes = sectionIndexes;
    }
    
    String getFilterName(){
        return sectionArguments[FILTER];
    }
    
    String getOrderName(){
        return sectionArguments[ORDER];
    }
    
    int getFilterIndex(){
        return sectionIndexes[FILTER];
    }
    
    int getOrderIndex(){
        return sectionIndexes[ORDER];
    }
}
