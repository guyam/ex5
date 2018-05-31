package filesprocessing.filters;
import java.io.File;


import java.util.Comparator;
import java.util.List;

public class FileTypeComperator implements Comparator<File> {


    public int compare(File file1, File file2) {
        String file1Path = file1.getAbsolutePath();
        String file1Type = file1Path.substring(file1Path.lastIndexOf('.') + 1).trim();
        String file2Path = file2.getAbsolutePath();
        String file2Type = file2Path.substring(file2Path.lastIndexOf('.') + 1).trim();
        return file1Type.compareTo(file2Type); //TODO - WORKS?

    }

}
