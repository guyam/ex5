package filesprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TypeOrderer extends GeneralOrder{

    @Override
    public ArrayList<String> order(ArrayList<File> arrayOfFiles) {
        Collections.sort(arrayOfFiles, new FileTypeComparator()); // TODO CHECK - comparator works??
        return fileToStringConverter(arrayOfFiles);
    }



}
