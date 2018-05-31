package filesprocessing.filters;

import java.io.File;
import java.util.ArrayList;


/**
 * A general super-class of all order classes. The sub-classes of this class receive an ArrayList of Files
 * and return a ordered ArrayList of file names.
 */
public abstract class GeneralOrder implements Orderable {

    /* An ArrayList of filtered files */
    ArrayList<File> filteredFileArray;

    /**
     * The class constructor //TODO CONTINUE
     * @param fileArrayInput
     */
    GeneralOrder(ArrayList<File> fileArrayInput){
        this.filteredFileArray = fileArrayInput;
    }


    protected ArrayList<String> fileToStringConverter (ArrayList<File> sortedFileArray){
        ArrayList<String> sortedStringArray = new ArrayList<>();
        for (File file : sortedFileArray) {
            sortedStringArray.add(file.getName());
        }
        return sortedStringArray;
    }




}
