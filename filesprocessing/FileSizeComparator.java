package filesprocessing;
import java.io.File;


import java.util.Comparator;
import java.util.List;

public class FileSizeComparator implements Comparator<File> {


    public int compare(File file1, File file2) {
        return (int)file1.length() - (int)file2.length();

    }

}
