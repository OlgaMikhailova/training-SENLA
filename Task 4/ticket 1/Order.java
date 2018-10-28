public class Order {
    private int id;
    private int idBook;
    private int priceBook;
    private Status status;
    private String dateOrder;
    private String namebook;
    private int number;

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
    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public Status getStatus() {
        return status;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public void setStatus(Status status){
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getPriceBook() {
        return priceBook;
    }
    public void setPriceBook(int priceBook){
        this.priceBook = priceBook;
    }

    public Order(int id,int idBook,String namebook,int priceBook,int number, String dateOrder, Status status){
    this.id = id;
    this.priceBook = priceBook;
    this.status = status;
    this.dateOrder = dateOrder;
    this.namebook = namebook;
    this.idBook = idBook;
    }
    @Override
    public String toString(){
        return "(id=" + this.id +", id book ="+this.idBook+", book name  "+this.namebook+ ", price book=" + this.priceBook +", number="+this.number+", date order " +this.dateOrder+", status order=" + status  +  ")";
    }
    public enum Status{
        DONE,CANCELLATION,TRANSIT,PENDING_UPLOAD,WAITING_FOR_DELIVERY,PREPARE,TAKEN,GENERATED
    }

}
