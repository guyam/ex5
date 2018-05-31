package filesprocessing.filters;

/**
 * An exception which inherits from the super-class CommandException. The exception is thrown when the
 * command file parsed has an invalid format.
 */
public class  BadFormatException extends CommandException {

    /* a universal version identifier for a Serializable class. */
    private static final long serialVersionUID = 1L;

    /* The bad format message printed by the exception */
    public final String badFormatMsg = "ERROR:  Bad format of the command file \n";


    /**
     * This method prints the class error msg.
     */
    @Override
    protected void printErrorMsg() {
        System.out.println(badFormatMsg);
    }

}





