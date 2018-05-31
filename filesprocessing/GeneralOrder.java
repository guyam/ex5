package filesprocessing;

import java.io.File;
import java.util.ArrayList;


/**
 * A general super-class of all order classes. The sub-classes of this class receive an ArrayList of Files
 * and return a ordered ArrayList of file names.
 */
public abstract class GeneralOrder implements Orderable {

    protected ArrayList<String> fileToStringConverter (ArrayList<File> sortedFileArray){
        ArrayList<String> sortedStringArray = new ArrayList<>();
        for (File file : sortedFileArray) {
            sortedStringArray.add(file.getName());
        }
        return sortedStringArray;
    }




}
