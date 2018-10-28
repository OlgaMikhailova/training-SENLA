import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> listBook = FileReading.OutputBook(FileReading.Output(FileReading.BookFile()));
        List<ShoppingList> shoppingList = FileReading.OutputShoopList(FileReading.Output(FileReading.OrderFile()));
        List<Order> listOrder = FileReading.OutputOrder(FileReading.Output(FileReading.OrderFile()));
        List<ReservationBook> reservationList = FileReading.OutputReservation(FileReading.Output(FileReading.ReservationFile()));
        CreateOrderAndReservation.AddOrderAndReservation(listBook,shoppingList,listOrder,reservationList);
    }
}
