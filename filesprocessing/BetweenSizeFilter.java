package filesprocessing;

import java.io.File;

/**
 * This class is a sub-class of SizeFilter, and represents a filter that returns an ArrayList of files in the
 * source directory, including all files which are between given size boundaries.
 */
public class BetweenSizeFilter extends SizeFilter {

    /**
     * The class constructor, which receives lower and upper bounds.
     * @param upperBound the upper size bound of the files to filter
     * @param lowerBound the lower size bound of the files to filter
     */
    BetweenSizeFilter(double upperBound, double lowerBound){
        super(upperBound, lowerBound);
    }

    /**
     * This method returns a boolean 'true' if the file input is between the lower and upper bounds giver.
     * @param file a <file> object.
     * @return 'true' if the file is between the given size boundaries.
     */
    @Override
    boolean conditionValid(File file) {
        return (lowerBound*KILOBYTES_TO_BYTES <= file.length())&&(file.length() <=
                upperBound*KILOBYTES_TO_BYTES);
    }
}
