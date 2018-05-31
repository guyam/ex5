package filesprocessing.filters;

import java.io.File;

public class SuffixNameFilter extends StringFilter {


    SuffixNameFilter(String suffixToCheck){
        super(suffixToCheck);

    }


    @Override
    boolean conditionValid(File file) {
        return file.getName().endsWith(stringToCheck);
    }
}
