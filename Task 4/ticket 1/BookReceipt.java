import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BookReceipt {
    public static void BookReceipt(int idBook,int numberBook,List<ReservationBook> reservationList, List<Book> bookList,List<Order> orderList){
        for (Book book: bookList){
            if(Objects.equals(idBook,book.getId())){
                if(Objects.equals(book.getNumber(),0)){
                    Collections.sort(reservationList, ReservationComparator.IdComparator);
                    for (ReservationBook reservation : reservationList){
                        if (Objects.equals(idBook,reservation.getIdBook())){
                            if(numberBook >= reservation.getNumber()){
                                numberBook -=reservation.getNumber();
                                orderList.add(CreateOrderAndReservation.CreateOrder(book.getId(),reservation.getNumber(),book.getPrice(),book.getName()));
                                reservationList.remove(reservation);
                            }
                            else if(numberBook < reservation.getNumber() && numberBook != 0){
                                reservation.setNumber(reservation.getNumber()-numberBook);
                                orderList.add(CreateOrderAndReservation.CreateOrder(book.getId(),numberBook,book.getPrice(),book.getName()));
                            }
                        }
                    }
                }
                else {
                    book.setNumber(book.getNumber() + numberBook);
                }
            }
        }
    }
}
