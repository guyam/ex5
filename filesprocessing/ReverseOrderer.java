package filesprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderer implements Orderable {

    Orderable inputOrder;

    public ReverseOrderer(Orderable orderInput){
        this.inputOrder = orderInput;
    }


    @Override
    public ArrayList<String> order(ArrayList<File> arrayOfFiles) {
        ArrayList <String> regularOrder = inputOrder.order(arrayOfFiles);
        Collections.reverse(regularOrder);
        return regularOrder;

    }
}
