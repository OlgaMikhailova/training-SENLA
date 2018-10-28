import java.util.Collections;
import java.util.List;

public class SortBy {

    public void OderDate(List<Order> list){
        Collections.sort(list, OrderComparator.DateComparator);
        System.out.println("Sort by date:");
        OutputToScreen.output(list);
    }
    public void OderPrice(List<Order> list){
        Collections.sort(list, OrderComparator.PriceComparator);
        System.out.println("Sort by price:");
        OutputToScreen.output(list);
    }
    public void OderStatus(List<Order> list){
        System.out.println("Sort by status:");
        Collections.sort(list, OrderComparator.StatusComparator);
        OutputToScreen.output(list);
    }
    public void BookName(List<Book> list){
        Collections.sort(list, BookComparator.NameComparator);
        System.out.println("Sort by name:");
        OutputToScreen.output(list);

    }
    public void BookPrice(List<Book> list){
        Collections.sort(list, BookComparator.PriceComparator);
        System.out.println("Sort by price:");
        OutputToScreen.output(list);

    }
    public void BookId(List<Book> list){
        Collections.sort(list, BookComparator.IdComparator);
        System.out.println("Sort by id:");
        OutputToScreen.output(list);

    }
    public void BookYear(List<Book> list){
        Collections.sort(list, BookComparator.YearComparator);
        System.out.println("Sort by year:");
        OutputToScreen.output(list);

    }
    public void BookNumber(List<Book> list){
        Collections.sort(list, BookComparator.NumberComparator);
        System.out.println("Sort by number of book:");
        OutputToScreen.output(list);
    }
    public void ReservationName(List<ReservationBook> list){
        Collections.sort(list, ReservationComparator.NameComparator);
        System.out.println("Sort by name:");
        OutputToScreen.output(list);
    }
    public void ReservationNumberOfBook(List<ReservationBook> list){
        Collections.sort(list, ReservationComparator.NumberComparator);
        System.out.println("Sort by number of book:");
        OutputToScreen.output(list);
    }
    public void ReservationId(List<ReservationBook> list){
        Collections.sort(list, ReservationComparator.IdComparator);
        System.out.println("Sort by id:");
        OutputToScreen.output(list);
    }
}
