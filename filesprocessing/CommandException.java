package filesprocessing;

public abstract class CommandException extends Exception {

    private static final long serialVersionUID = 1L;


    public CommandException () {
        super();
        }


    protected abstract void printErrorMsg();



    }




