import com.senla.training.TextFileWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileReading {

    public static File ReservationFile() {
        File file = new File("F:\\IdeaProjects\\reservation.txt");
        return file;
    }
    public static File BookFile() {
        File file = new File("F:\\IdeaProjects\\booksname.txt");
        return file;
    }
    public static File OrderFile() {
        File file = new File("F:\\IdeaProjects\\order.txt");
        return file;
    }
    public static File ShoopListFile() {
        File file = new File("F:\\IdeaProjects\\shooplist.txt");
        return file;
    }
    public static String[] Output(File file) {
        TextFileWorker zxc = new TextFileWorker(file.getPath());
        String[] strings = zxc.readFromFile();
        return strings;
    }
    public static List OutputReservation(String[] strings ) {
        List<ReservationBook> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String[] values = strings[i].split(";");
            ReservationBook reservationBook = new ReservationBook(Integer.parseInt(values[0].trim()),Integer.parseInt(values[1].trim()),values[2], Integer.parseInt(values[3].trim()),values[4],Order.Status.valueOf(values[5]));
            list.add(reservationBook);
        }
        return list;
    }
    public static List OutputBook(String[] strings ) {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String[] values = strings[i].split(";");
            Book book = new Book(Integer.parseInt(values[0].trim()), values[1], Integer.parseInt(values[2].trim()), Integer.parseInt(values[3].trim()),Integer.parseInt(values[4].trim()),values[5]);
            list.add(book);
        }
        return list;
    }
    public static List OutputOrder(String[] strings ) {
        List<Order> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String[] values = strings[i].split(";");
            Order order = new Order(Integer.parseInt(values[0].trim()),Integer.parseInt(values[1].trim()),values[2], Integer.parseInt(values[3].trim()),Integer.parseInt(values[4].trim()), values[5], Order.Status.valueOf(values[6]));
            list.add(order);
        }
        return list;
    }
    public static List OutputShoopList(String[] strings ) {
        List<ShoppingList> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            String[] values = strings[i].split(";");
            ShoppingList shoppingList = new ShoppingList(Integer.parseInt(values[0].trim()),Integer.parseInt(values[1].trim()), Integer.parseInt(values[2].trim()));
            list.add(shoppingList);
        }
        return list;
    }
}
