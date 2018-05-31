package filesprocessing;

import java.util.ArrayList;

public class Section {
    
    // Constants //
    private final int ORDER = 1;
    private final int FILTER = 0;

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
