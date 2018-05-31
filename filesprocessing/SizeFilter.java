package filesprocessing;

/**
 * An abstract sub-class of GeneralFilter. This class is a super-class for all three size-related filters,
 * and thus the class constructor receives either one or two size boundaries to filter the files.
 */
public abstract class SizeFilter extends GeneralFilter {

    /* the factor to convert kilo-bytes to bytes*/
    final double KILOBYTES_TO_BYTES = 1024;

    /* the lower size bound for the files to filter*/
    double lowerBound;

    /* the upper size bound for the files to filter*/
    double upperBound;

    /* the single size bound for the files to filter as greater or smaller*/
    double sizeBound;

    /**
     * One of the class constructors. This constructors receives two size boundaries.
     * @param lowerSizeBound the lower size boundary to filter the files.
     * @param upperSizeBound the upper size boundary to filter the files.
     */
    SizeFilter(double lowerSizeBound, double upperSizeBound){ // constructor for two bounds
        this.lowerBound = lowerSizeBound;
        this.upperBound = upperSizeBound;
    }

    /**
     * One of the class constructors. This constructor receives a single size boundary. This boundary will
     * be used by the class sub-classes to filter files with a size smaller or greater than the single size
     * boundary input.
     * @param sizeBoundInput the size boundary for files greater or smaller.
     */
    SizeFilter(double sizeBoundInput){ // notice length method is long, regular
        this.sizeBound = sizeBoundInput;
    }


}
