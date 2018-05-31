package filesprocessing.filters;


public class  InvalidUsageException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String usageMsg = "ERROR: Invalid usage. Only two program arguments are allowed \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(usageMsg);
    }


}
