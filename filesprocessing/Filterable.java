package filesprocessing;
import java.io.File;


import java.util.ArrayList;

/**
 * An interface implemented by all classes if objects which filter files.
 */
public interface Filterable {

    /**
     * A method which receives an ArrayList of File objects and returns a filtered ArrayList of File
     * objects, based on the specific filter property of the class implementing tis interface.
     * @param arrayOfFiles an ArrayList of File objects to filter
     * @return A filtered ArrayList of files
     */
    public ArrayList<File> filter(File[] arrayOfFiles);



}
