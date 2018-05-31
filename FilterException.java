package filesprocessing.filters;

public class FilterException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String filterMsg = "ERROR: Problem with FILTER sub-section name in file \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(filterMsg);
    }


}
