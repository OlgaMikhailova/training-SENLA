import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CreateOrderAndReservation {

    public static void AddOrderAndReservation(List<Book> bookList, List<ShoppingList> shoppingList,List<Order> orderList,List<ReservationBook> reservationList){
        for (ShoppingList s :shoppingList) {
            for (Book book : bookList) {
                if ((Objects.equals(book.getId(),s.getId()))) {
                    if (book.getNumber() >= s.getNunber()) {
                        orderList.add(CreateOrder(book.getId(),s.getNunber(), book.getPrice(), book.getName()));
                    } else if (book.getNumber() < s.getNunber()){
                        int nunberReservtion = s.getNunber() - book.getNumber();
                        reservationList.add(CreateReservationBook(book.getId(),book.getName(),nunberReservtion));
                        orderList.add(CreateOrder(book.getId(),book.getNumber(), book.getPrice(), book.getName()));
                    }
                    book.setNumber(RemoveBook(book.getNumber(),s.getNunber()));
                }
            }
        }
        shoppingList.clear();
        return;
    }
    public static int RemoveBook(int warehouse, int order){
        return warehouse-order;
    }
    public static ReservationBook CreateReservationBook(int idBook,String nameBook, int number){
        String date = DateNow.DateNow();
        int idReservation = CreateID.getReservationID();
        Order.Status status = Order.Status.WAITING_FOR_DELIVERY;
        ReservationBook reservationBook = new ReservationBook(idReservation,idBook,nameBook,number,date,status);
        return reservationBook;
    }

    public static Order CreateOrder(int idbook, int number, int price, String namebook){
      String date = DateNow.DateNow();
      Order.Status status = Order.Status.GENERATED;
      int idOrder = CreateID.GeneratingOrderID();
      Order order = new Order(idOrder,idbook,namebook,price,number,date,status);
      return order;
    }
}
