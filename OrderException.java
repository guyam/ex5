package filesprocessing.filters;

public class OrderException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String orderMsg = "ERROR: Problem with ORDER sub-section name in the commands file \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(orderMsg);
    }


}
