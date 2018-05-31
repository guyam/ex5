package filesprocessing;


public class  IOException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String IoMsg = "ERROR: IO error. Trouble while trying to access the commands file \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(IoMsg);
    }


}
