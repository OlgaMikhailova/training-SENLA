public class ReservationBook {
    private int idBook;
    private int number;
    private Order.Status status;
    private String dateReservation;
    private String nameBook;
    private int idReservation;

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Order.Status getStatus() {
        return status;
    }

    public void setStatus(Order.Status status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public ReservationBook(int idReservation, int idBook, String nameBook, int number, String dateReservation, Order.Status status){
        this.dateReservation = dateReservation;
        this.idBook = idBook;
        this.number = number;
        this.status = status;
        this.nameBook = nameBook;
        this.idReservation = idReservation;
    }
}
