package filesprocessing;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TypeOrderer extends GeneralOrder{

    TypeOrderer(ArrayList<File> fileArrayInput, boolean printInReverse){
        super(fileArrayInput,printInReverse);
    }



    @Override
    public ArrayList<String> Order(ArrayList<File> arrayOfFiles) {
        Collections.sort(arrayOfFiles, new FileTypeComperator()); // TODO CHECK - comparator works??
        if (reverseOrder){
            reverseList(arrayOfFiles);
        }
        return fileToStringConverter(arrayOfFiles);
    }



}
