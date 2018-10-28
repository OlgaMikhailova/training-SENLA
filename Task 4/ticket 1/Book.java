public class Book {
    private String name;
    private int year;
    private int id;
    private int price;
    private int number;
    private String dateOfDelivery;

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int id, String name, int year, int price, int number,String dateOfDelivery) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.year = year;
        this.number = number;
        this.dateOfDelivery = dateOfDelivery;
    }
    @Override
    public String toString(){
        return "(name book=" + this.name + ", publication date=" + this.year + ", price=" + this.price + ")";
    }
}
