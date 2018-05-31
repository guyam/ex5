package filesprocessing.filters;
import java.io.File;
import java.util.ArrayList;


public class NotFilter implements Filterable {

    Filterable inputFilter;

    NotFilter (Filterable filterInput){
        this.inputFilter = filterInput;
    }


    @Override
    public ArrayList<File> filter(File[] arrayOfFiles) {
        ArrayList <File> notFilteredFiles = new ArrayList<>();
        ArrayList <File> filesToFilter = inputFilter.filter(arrayOfFiles);
        for (File file : arrayOfFiles) {
            if (!filesToFilter.contains(file)) {
                notFilteredFiles.add(file);
            }
        }
        return notFilteredFiles;
    }



}
