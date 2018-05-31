package filesprocessing;

import java.io.File;


/**
 * This class represents a filter that returns an ArrayList of all files in the source directory.
 */
public class AllFilter extends GeneralFilter {

    /**
     * The class constructor. The constructor receives no parameters and calls the super-class constructor.
     */
    AllFilter(){
        super();
    }

    /**
     * This method receives a file and returns 'true' in order to filter all files.
     * @param file a <File> object
     * @return boolean 'true'for all files
     */
    @Override
    boolean conditionValid(File file) {
        return true;
    }
}
