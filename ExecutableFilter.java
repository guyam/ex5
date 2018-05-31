package filesprocessing.filters;

import java.io.File;

public class ExecutableFilter extends GeneralFilter {

    ExecutableFilter(){
        super();
    }


    @Override
    boolean conditionValid(File file) {
        return file.canExecute();
    }
}
