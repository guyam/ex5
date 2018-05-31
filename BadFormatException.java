package filesprocessing.filters;


public class  BadFormatException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String badFormatMsg = "ERROR:  Bad format of the command file \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(badFormatMsg);
    }

}





