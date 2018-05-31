package filesprocessing.filters;

import java.io.File;

public class WritableFilter extends PropertyFilter {



    WritableFilter(boolean positiveFilter){
        super(positiveFilter);
    }


    @Override
    boolean conditionValid(File file) {
        if (this.positiveFilter){ // if true (='YES') return files with eriting permission
            return file.canWrite();
        } // else - return field with NOT writing permission
        return !file.canWrite();
    }
}
