package filesprocessing;

public class OrderAndWarningWrapper {

    Orderable order;

    String warning;

    OrderAndWarningWrapper(Orderable order, String warning){
        this.order = order;
        this.warning = warning;
    }

    String getWarning(){
        return warning;
    }

    Orderable getOrder(){
        return order;
    }
}
