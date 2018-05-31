package filesprocessing;

import java.util.ArrayList;

public class OrderableFactory {

    // Constants //
    private final String REVERSE = "REVERSE";
    private final String ABSOLUTE_NAME = "abs";
    private final String TYPE = "type";
    private final String SIZE = "size";

    private final String ILLEGAL_INPUT_MSG = "Warning in line: ";

    private int orderIndex;

    private boolean shouldGenerateWarning = false;

    private Orderable orderable;

    public OrderableFactory(NameAndIndexWrapper orderWrapper){
        orderIndex = orderWrapper.line;
        String[] orderArgs = orderWrapper.name.split("#");
        boolean NOT = false;
        int numOfInputArgs = orderArgs.length - 1;
        if (REVERSE.equals(orderArgs[orderArgs.length-1])) {
            NOT = true;
            numOfInputArgs --;
        }
        try {
            switch (orderArgs[0]) {
                case ABSOLUTE_NAME:
                    if (numOfInputArgs != 0)
                        throw new IllegalArgumentException();
                    orderable = new AbsOrderer();
                    break;
                case SIZE:
                    if (numOfInputArgs != 0)
                        throw new IllegalArgumentException();
                    orderable = new SizeOrderer();
                    break;
                case TYPE:
                    if (numOfInputArgs != 0)
                        throw new IllegalArgumentException();
                    orderable = new TypeOrderer();
                    break;
                default:
                    throw new IllegalArgumentException(ILLEGAL_INPUT_MSG);
            }
            if (NOT){
                orderable = new ReverseOrderer(orderable);
            }
        }
        catch (IllegalArgumentException e){
            orderable = new AbsOrderer();
            shouldGenerateWarning = true;
        }
    }

    public OrderAndWarningWrapper generateOrder(){
        String warningMessage = null;
        if (shouldGenerateWarning)
            warningMessage = ILLEGAL_INPUT_MSG + orderIndex;
        return new OrderAndWarningWrapper(orderable, warningMessage);
    }
}
