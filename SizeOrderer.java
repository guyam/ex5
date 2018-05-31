package filesprocessing.filters;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class SizeOrderer extends GeneralOrder {

    SizeOrderer(ArrayList<File> fileArrayInput, boolean printInReverse){
        super(fileArrayInput,printInReverse);
    }


    @Override
    public ArrayList<String> Order(ArrayList<File> arrayOfFiles) {
        Collections.sort(arrayOfFiles, new FileSizeComparator()); // TODO CHECK - comparator works??
        if (reverseOrder){
            reverseList(arrayOfFiles);
        }
        return fileToStringConverter(arrayOfFiles);
    }

}
