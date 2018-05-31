package filesprocessing.filters;

import java.io.File;

public class BetweenSizeFilter extends SizeFilter {

    BetweenSizeFilter(double upperBound, double lowerBound){
        super(upperBound, lowerBound);
    }


    @Override
    boolean conditionValid(File file) {
        return (lowerBound*KILOBYTES_TO_BYTES < file.length())&&(file.length() < upperBound*KILOBYTES_TO_BYTES);
    }
}
