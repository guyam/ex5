package filesprocessing.filters;

import java.io.File;


/**
 * This is a class which represents a file filterer based on the Executable property of the file.
 */
public class ExecutableFilter extends PropertyFilter {

    /**
     * The class constructor, which calls the constructor of the super-class.
     * @param positiveFilter  boolean flag indicating if to filter files with the property, or without it.
     */
    ExecutableFilter(boolean positiveFilter){
        super(positiveFilter);
    }


    /**
     * This method checks if the files executable property matches the input flag.
     * @param file - <File> object to check.
     * @return boolean 'true' - if the file's executable property matches the boolean condition checked.
     */
    @Override
    boolean conditionValid(File file) {
        if (this.positiveFilter){ // if true (='YES') return files with eriting permission
            return file.canExecute();
        } // else - return field with NOT writing permission
        return !file.canExecute();
    }
}

