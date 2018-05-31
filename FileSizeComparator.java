package filesprocessing.filters;
import java.io.File;


import java.util.Comparator;
import java.util.List;


/**
 * A File comparator object. The Comparator compares two files based on their size.
 */

public class FileSizeComparator implements Comparator<File> {

    /**
     * This method compares the size of the input files.
     * @param file1 first file object to compare.
     * @param file2 second file object to compare.
     * @return positive int if the first size is larger than the second; negative int if the second file is
     * larger; otherwise - 0 is returned.
     */
    public int compare(File file1, File file2) {
        return (int)file1.length() - (int)file2.length();

    }

}
