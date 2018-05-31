package filesprocessing;

import java.io.File;

public class PrefixNameFilter extends StringFilter {


    PrefixNameFilter(String prefixToCheck){
        super(prefixToCheck);

    }


    @Override
    boolean conditionValid(File file) {
        return file.getName().startsWith(stringToCheck);
    }
}
