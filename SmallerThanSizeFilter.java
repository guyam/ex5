package filesprocessing.filters;

import java.io.File;

public class SmallerThanSizeFilter extends SizeFilter {

    SmallerThanSizeFilter(double sizeBoundInput){
        super(sizeBoundInput);
    }

    @Override
    boolean conditionValid(File file) {
        return file.length() < KILOBYTES_TO_BYTES*sizeBound;
    }
}
