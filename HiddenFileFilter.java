package filesprocessing.filters;

import java.io.File;

public class HiddenFileFilter extends PropertyFilter {

    HiddenFileFilter(boolean positiveFilter){
        super(positiveFilter);
    }


    @Override
    boolean conditionValid(File file) {
        if (this.positiveFilter){ // if true (='YES') return files with eriting permission
            return file.isHidden();
        } // else - return field with NOT writing permission
        return !file.isHidden();
    }
}
