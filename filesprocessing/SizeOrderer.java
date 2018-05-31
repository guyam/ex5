package filesprocessing;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class SizeOrderer extends GeneralOrder {

    @Override
    public ArrayList<String> order(ArrayList<File> arrayOfFiles) {
        Collections.sort(arrayOfFiles, new FileSizeComparator()); // TODO CHECK - comparator works??

        return fileToStringConverter(arrayOfFiles);
    }

}
