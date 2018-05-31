package filesprocessing;

public class FilterException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String filterMsg = "ERROR: FILTER sub-section missing \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(filterMsg);
    }


}
