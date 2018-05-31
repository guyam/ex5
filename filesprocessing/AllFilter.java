package filesprocessing;

import java.io.File;

public class AllFilter extends GeneralFilter {

    AllFilter(){
        super();
    }


    @Override
    boolean conditionValid(File file) {
        return true;
    }
}
