import java.util.Comparator;

public class BookComparator implements Comparable<Book> {
    private int id;

    @Override
    public int compareTo(Book o) {
        return this.id- o.getId();
    }
    public static Comparator<Book> IdComparator = new Comparator<Book>() {
        @Override
        public int compare(Book e1, Book e2) {
            return  (e1.getId() - e2.getId());
        }
    };
    public static Comparator<Book> PriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book e1, Book e2) {
            return (int) (e1.getPrice() - e2.getPrice());
        }
    };
    public static Comparator<Book> NameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book e1, Book e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Book> YearComparator = new Comparator<Book>() {
        @Override
        public int compare(Book e1, Book e2) {
            return e1.getYear() - e2.getYear();
        }
    };
    public static Comparator<Book> NumberComparator = new Comparator<Book>() {
        @Override
        public int compare(Book e1, Book e2) {
            return  (int) (e1.getNumber() - e2.getNumber());
        }
    };
}
