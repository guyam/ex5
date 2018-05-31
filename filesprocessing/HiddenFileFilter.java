package filesprocessing;

import java.io.File;

public class HiddenFileFilter extends GeneralFilter {

    HiddenFileFilter(){
        super();
    }


    @Override
    boolean conditionValid(File file) {
        return file.isHidden();
    }
}
