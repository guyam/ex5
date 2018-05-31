package filesprocessing.filters;

import java.io.File;

public class WritableFilter extends GeneralFilter {

    WritableFilter(){
        super();
    }


    @Override
    boolean conditionValid(File file) {
        return file.canWrite();
    }
}
