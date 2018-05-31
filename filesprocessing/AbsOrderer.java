package filesprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class generates an array of files, sorted by their absolute name, from 'a' to 'z'.
 */
public class AbsOrderer extends GeneralOrder {

    /**
     * This method sorts the files by their absolute name, and returns a sorted array of their names.
     * @param arrayOfFiles an ArrayList collection of <File> objects
     * @return an ArrayList of Strings - indicating the sorted files' names/
     */
    @Override
    public ArrayList<String> order(ArrayList<File> arrayOfFiles) {
        Collections.sort(arrayOfFiles, new FilePathComparator()); // TODO CHECK - comparator works??
        return fileToStringConverter(arrayOfFiles);



    }
}
