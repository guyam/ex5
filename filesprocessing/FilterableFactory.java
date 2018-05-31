package filesprocessing;

import java.util.ArrayList;

public class FilterableFactory {

    private final String GREATER_THAN = "greater_than";
    private final String BETWEEN = "between";
    private final String SMALLER_THAN = "smaller_than";
    private final String FILE = "file";
    private final String CONTAINS = "contains";
    private final String PREFIX = "prefix";
    private final String SUFFIX = "suffix";
    private final String WRITABLE = "writable";
    private final String EXECUTABLE = "executable";
    private final String HIDDEN = "hidden";
    private final String ALL = "all";
    private final String NOT = "NOT";

    private final String ILLEGAL_INPUT_MSG = "Warning in line: ";

    private int filterIndex;

    private boolean shouldGenerateWarning = false;
//    private ArrayList<String[]> argsList = new ArrayList<String[]>();

    private Filterable filterable;

    FilterableFactory(NameAndIndexWrapper filterWrapper){
        filterIndex = filterWrapper.line;
        String[] filterArgs = filterWrapper.name.split("#");
        boolean REVERSE = false;
        int numOfInputArgs = filterArgs.length - 1;
        if (NOT.equals(filterArgs[filterArgs.length-1])) {
            REVERSE = true;
            numOfInputArgs --;
        }
        try {
            switch (filterArgs[0]) {
                case GREATER_THAN:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new GreaterThanSizeFilter(Double.parseDouble(filterArgs[1]));
                    break;
                case SMALLER_THAN:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new SmallerThanSizeFilter(Double.parseDouble(filterArgs[1]));
                    break;
                case BETWEEN:
                    if (numOfInputArgs != 2)
                        throw new IllegalArgumentException();
                    filterable = new BetweenSizeFilter(Double.parseDouble(filterArgs[1]),
                            Double.parseDouble(filterArgs[2]));
                    break;
                case FILE:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new NameFilter(filterArgs[1]);
                    break;
                case CONTAINS:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new ContainedNameFilter(filterArgs[1]);
                    break;
                case PREFIX:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new PrefixNameFilter(filterArgs[1]);
                    break;
                case SUFFIX:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = (new SuffixNameFilter(filterArgs[1]));
                    break;
                case WRITABLE:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new WritableFilter(filterArgs[1]);
                    break;
                case EXECUTABLE:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new ExecutableFilter(filterArgs[1]);
                    break;
                case HIDDEN:
                    if (numOfInputArgs != 1)
                        throw new IllegalArgumentException();
                    filterable = new HiddenFileFilter(filterArgs[1]);
                    break;
                case ALL:
                    if (numOfInputArgs != 0)
                        throw new IllegalArgumentException();
                    filterable = new AllFilter();
                    break;
                default:
                    throw new IllegalArgumentException(ILLEGAL_INPUT_MSG);
                    break;
            }
            if (REVERSE){
                filterable = NotFilter(filterable);
            }
        }
        catch (IllegalArgumentException e){
            filterable = new AllFilter();
            shouldGenerateWarning = true;

        }
    }

    public FilterAndWarningWrapper generateFilter(){
        String warningMessage = null;
        if (shouldGenerateWarning)
            warningMessage = ILLEGAL_INPUT_MSG + filterIndex;
        return new FilterAndWarningWrapper(filterable, warningMessage);
    }

}
