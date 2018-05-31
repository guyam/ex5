package filesprocessing.filters;


/**
 * An abstract super-class of all string-related filter classes. This class receives a single String and
 * all three sub-classes filter files while using the String input of the class.
 */
public abstract class StringFilter extends GeneralFilter {

    /* String input to check in file name*/
    final String stringToCheck;

    /**
     * The class constructor.
     * @param stringFilterInput String input to filter the files with.
     */
    StringFilter(String stringFilterInput){
        this.stringToCheck = stringFilterInput;
    }



}
