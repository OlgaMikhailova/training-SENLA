import java.util.List;
import java.util.Objects;

public class CancelOrder {
    public void CancelOrder(int idOrder, List<Order> orderList,List<Book> bookList,List<ReservationBook> reservationList){
        for(Order order : orderList){
            if(Objects.equals(idOrder,order.getId())){
                order.setStatus(ChangeStatus.ToCancellation(order.getStatus()));
                BookReceipt.BookReceipt(order.getIdBook(),order.getNumber(),reservationList,bookList,orderList);
            }
        }
        return;
    }
}
