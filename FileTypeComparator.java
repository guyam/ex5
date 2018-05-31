package filesprocessing.filters;
import java.io.File;


import java.util.Comparator;
import java.util.List;

/**
 * A File comparator object. The Comparator compares two files based on their file type name.
 */
public class FileTypeComparator implements Comparator<File> {


     /**
     * This method compares the type of the input files.
     * @param file1 first file object to compare.
     * @param file2 second file object to compare.
     * @return positive int if the first file type is is lexicographically higher than the seconds' file
     * path name; A negative int is returned if the second files' type is lexicographically higher;
     * Otherwise - 0 is returned.
     */
    public int compare(File file1, File file2) {
        String file1Path = file1.getAbsolutePath();
        String file1Type = file1Path.substring(file1Path.lastIndexOf('.') + 1).trim();
        String file2Path = file2.getAbsolutePath();
        String file2Type = file2Path.substring(file2Path.lastIndexOf('.') + 1).trim();
        return file1Type.compareTo(file2Type); //TODO - WORKS?

    }


}
