package filesprocessing;

public class OrderException extends CommandException {

    private static final long serialVersionUID = 1L;

    public final String orderMsg = "ERROR: ORDER sub-section missing \n";


    @Override
    protected void printErrorMsg() {
        System.out.println(orderMsg);
    }


}
