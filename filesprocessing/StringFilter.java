package filesprocessing;

import java.io.File;
import java.util.ArrayList;

public abstract class StringFilter extends GeneralFilter {

    final String stringToCheck;

    StringFilter(String stringFilterInput){
        this.stringToCheck = stringFilterInput;
    }




}
