public class ChangeStatus {
    public Order.Status ChangeStatus(Order.Status status){
        switch (status){
            case GENERATED:
                status = Order.Status.TAKEN;
                break;
            case TAKEN:
                status = Order.Status.PREPARE;
                break;
            case PREPARE:
                status = Order.Status.PENDING_UPLOAD;
                break;
            case PENDING_UPLOAD:
                status = Order.Status.TRANSIT;
                break;
            case TRANSIT:
                status = Order.Status.DONE;
                break;
            case DONE:
                break;
        }
        return status;
    }
    public static Order.Status ToCancellation(Order.Status status){
       return status = Order.Status.CANCELLATION;
    }
}
