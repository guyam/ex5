package filesprocessing.filters;

import java.io.File;

/**
 * A sub-class of StringFilter. This class represents a filter object, which filters files if their name
 * contains a given String.
 */
public class ContainedNameFilter extends StringFilter {

    /**
     * This is the class constructor. Receives a string input and calls the constructor of the super-class.
     * @param containedStringInput String input to check.
     */
    ContainedNameFilter(String containedStringInput){
        super(containedStringInput);
    }


    /**
     * This method checks if the input file's name contains the given String or not.
     * @param file single <File> input to check.
     * @return boolean 'true' if the file contains the string to check, or not.
     */
    @Override
    boolean conditionValid(File file) {
        return file.getName().contains(stringToCheck);
    }



}
