package filesprocessing;

import java.io.File;

public class GreaterThanSizeFilter extends SizeFilter {

    GreaterThanSizeFilter(double sizeBoundInput){
        super(sizeBoundInput);
    }


    @Override
    boolean conditionValid(File file) {
        return file.length() > KILOBYTES_TO_BYTES*sizeBound; // *1000 because of killo?
    }
}
