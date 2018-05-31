package filesprocessing;
import java.io.File;

import java.util.ArrayList;


public abstract class SizeFilter extends GeneralFilter {

    final double KILOBYTES_TO_BYTES = 1000;


    double lowerBound;
    double upperBound;
    double sizeBound;



    SizeFilter(double lowerSizeBound, double upperSizeBound){ // constructor for two bounds
        this.lowerBound = lowerSizeBound;
        this.upperBound = upperSizeBound;
    }


    SizeFilter(double sizeBoundInput){ // notice length method is long, regular
        this.sizeBound = sizeBoundInput;
    }


}
