package filesprocessing.filters;
import java.io.File;
import java.util.ArrayList;


public class FilterDecorator {

    Filterable inputFilter;
    ArrayList <File> allFiles;

    FilterDecorator (ArrayList <File> allFilesInput, Filterable filterInput){
        this.inputFilter = filterInput;
        this.allFiles = allFilesInput;
    }


    public ArrayList <File> getDifference(){
        ArrayList <File> filesToFilterOut = inputFilter.filter(allFiles);
        allFiles.removeAll(filesToFilterOut); // filters out
        return allFiles;

    }



}
