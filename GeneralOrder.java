package filesprocessing.filters;

import java.io.File;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;

public abstract class GeneralOrder implements Orderable {

    boolean reverseOrder;
    ArrayList<File> filteredFileArray;


    GeneralOrder(ArrayList<File> fileArrayInput, boolean printInReverse){
        this.filteredFileArray = fileArrayInput;
        this.reverseOrder = printInReverse;
    }


    protected ArrayList<String> fileToStringConverter (ArrayList<File> sortedFileArray){
        ArrayList<String> sortedStringArray = new ArrayList<>();
        for (File file : sortedFileArray) {
            sortedStringArray.add(file.getName());
        }
        return sortedStringArray;
    }



    public void reverseList (ArrayList<File> fileArray ){
        Collections.reverse(fileArray);
    }




}
