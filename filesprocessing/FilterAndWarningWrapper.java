package filesprocessing;

public class FilterAndWarningWrapper {

    Filterable filter;

    String warning;

    FilterAndWarningWrapper(Filterable filter, String warning){
        this.filter = filter;
        this.warning = warning;
    }

    String getWarning(){
        return warning;
    }

    Filterable getFilter(){
        return filter;
    }
}
