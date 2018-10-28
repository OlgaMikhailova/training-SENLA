import java.util.Comparator;

public class OrderComparator implements Comparable<Order>{
    private int id;
    @Override
    public int compareTo(Order o) {
        return this.id- o.getId();
    }
    public static Comparator<Order> PriceComparator = new Comparator<Order>() {
        @Override
        public int compare(Order e1, Order e2) {
            return (int) (e1.getPriceBook() - e2.getPriceBook());
        }
    };
    public static Comparator<Order> StatusComparator = new Comparator<Order>() {
        @Override
        public int compare(Order e1, Order e2) {
            return e1.getStatus().compareTo(e2.getStatus());
        }
    };
    public static Comparator<Order> DateComparator = new Comparator<Order>() {
        @Override
        public int compare(Order e1, Order e2) {
            return e1.getDateOrder().compareTo(e2.getDateOrder());
        }
    };
}
