package filesprocessing.filters;
import java.io.File;


import java.util.Comparator;
import java.util.List;

public class FilePathComperator implements Comparator<File> {


    public int compare(File file1, File file2) {
        return file1.getAbsolutePath().compareTo(file2.getAbsolutePath()); //TODO - WORKS

    }

}
