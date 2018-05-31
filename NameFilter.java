package filesprocessing.filters;

import java.io.File;

public class NameFilter extends StringFilter {

    NameFilter(String fileNameInput){
        super(fileNameInput);
    }


    @Override
    boolean conditionValid(File file) {
        return file.getName().equals(stringToCheck);
    }





}



