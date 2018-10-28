import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShoppingList {
    private int id;
    private int price;
    private int nunber;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNunber() {
        return nunber;
    }

    public void setNunber(int nunber) {
        this.nunber = nunber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public ShoppingList(int id, int price,int nunber){
        this.id = id;
        this.nunber = nunber;
        this.price = price;
    }
}
