package filesprocessing.filters;

import java.io.File;

public class ContainedNameFilter extends StringFilter {

    ContainedNameFilter(String containedStringInput){
        super(containedStringInput);
    }



    @Override
    boolean conditionValid(File file) {
        return file.getName().contains(stringToCheck);
    }



}
