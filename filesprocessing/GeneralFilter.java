package filesprocessing;

import java.io.File;
import java.util.ArrayList;

/**
 * An abstract super-class of all Filter-related classes. The class implements the Filterable interface.
 */
public abstract class GeneralFilter implements Filterable {

    /**
     * An abstract method which returns 'true' if the specific filter-related class condition is fulfilled
     * for a specific Fie, otherwise - false.
     * @param file a single File object.
     * @return boolean 'true' if the filter condition is fulfilled.
     */
    abstract boolean conditionValid(File file);

    /**
     * This method iterated over an ArrayList of File objects, and returns an ArrayList of Files which
     * fulfill the specific property checked by the filter.
     * @param arrayOfFiles an ArrayList of File objects to filter
     * @return ArrayList of File object after filtering by the checked property.
     */
    public ArrayList<File> filter(File[] arrayOfFiles) {
        ArrayList<File> filteredFiles = new ArrayList<>();
        for (File file : arrayOfFiles) {
            if (conditionValid(file)) {
                filteredFiles.add(file);
            }
        }
        return filteredFiles;


    }


}
