package filesprocessing;
import java.io.File;


import java.util.Comparator;
import java.util.List;

/**
 * A File comparator object. The Comparator compares two files based on their file name path.
 */
public class FilePathComparator implements Comparator<File> {

    /**
     * This method compares the path of the input files.
     * @param file1 first file object to compare.
     * @param file2 second file object to compare.
     * @return positive int if the first file path is is lexicographically higher than the seconds' file
     * path name; A negative int is returned if the second files' path is lexicographically higher;
     * Otherwise - 0 is returned.
     */
    public int compare(File file1, File file2) {
        return file1.getAbsolutePath().compareTo(file2.getAbsolutePath()); //TODO - WORKS

    }

}
