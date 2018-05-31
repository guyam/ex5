package filesprocessing.filters;


/**
 * An abstract class which is the super-class of all file filters which are based on the file properties -
 * hidden/ executable/ writable. This is a sub-class of the abstract GeneralFilter class.
 */
public abstract class PropertyFilter extends GeneralFilter{

    /* positive flag indicating if file with, or without the property will be filtered*/
    boolean positiveFilter;

    /**
     * The class constructor. Which receives a boolean flag.
     * @param yesFilterInput boolean input indicating if to filter files with, or without, the property
     *                       checked.
     */
    PropertyFilter(boolean yesFilterInput){
        this.positiveFilter = yesFilterInput;
    }




}
