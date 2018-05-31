package filesprocessing.filters;

import java.io.File;
import java.util.ArrayList;

public abstract class GeneralFilter implements Filterable {

    GeneralFilter(){}

    abstract boolean conditionValid(File file);


    public ArrayList<File> filter(ArrayList<File> arrayOfFiles) {
        ArrayList<File> filteredFiles = new ArrayList<>();
        for (File file : arrayOfFiles) {
            if (conditionValid(file)) {
                filteredFiles.add(file);
            }
        }
        return filteredFiles;


    }


}
