public class CreateID {
    private static int orderID;
    private static int reservationID;

    public static int getReservationID() {
        return reservationID;
    }

    public static void setReservationID(int reservationID) {
        CreateID.reservationID = reservationID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        CreateID.orderID = orderID;
    }
    public static int GeneratingOrderID(){
       return orderID++;
    }
    public static int GeneratingReservaionID(){
       return reservationID++;
    }

}
