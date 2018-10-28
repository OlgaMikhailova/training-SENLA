import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AdditionalSorting {
    public void CompletedOrderAndBetweenDate(List<Order> orderList, String beginningOfPeriod, String endingOfPeriod ) throws ParseException {
        List<Order> completedOder = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date beginning = format.parse(beginningOfPeriod);
        Date ending = format.parse(endingOfPeriod);
        for (Order order : orderList){
            Date date = format.parse(order.getDateOrder());
            if(order.getStatus().equals(Order.Status.DONE) && (date.after(beginning)) && (date.before(ending))){
                completedOder.add(order);
            }
        }
        OutputToScreen.output(completedOder);
    }
    public void ViewOrder(List<Order> orderList, int id){
        for (Order order : orderList){
            if(Objects.equals(order.getId(),id)){
                System.out.printf(order.toString());
            }
        }
    }
    public void ViewBook(List<Book> bookList, int id){
        for (Book book : bookList){
            if(Objects.equals(book.getId(),id)){
                System.out.printf(book.toString());
            }
        }
    }
    public void ViewBook(List<Book> bookList, String name){
        for (Book book : bookList){
            if(Objects.equals(book.getName(),name)){
                System.out.printf(book.toString());
            }
        }
    }
    public void AmountMoneyEarnedOverPeriod(List<Order> orderList,String beginningOfPeriod, String endingOfPeriod) throws ParseException {
        int sum = 0;
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date beginning = format.parse(beginningOfPeriod);
        Date ending = format.parse(endingOfPeriod);
        for (Order order : orderList){
            Date date = format.parse(order.getDateOrder());
            if(order.getStatus().equals(Order.Status.DONE) && (date.after(beginning)) && (date.before(ending))){
                sum += (order.getNumber() * order.getPriceBook());
            }
        }
        System.out.printf("Amount of money earned over a period of time "+sum + " since "+beginningOfPeriod +" to "+endingOfPeriod);
    }
    public void NumberOfCompletedOrdersOverPeriod(List<Order> orderList,String beginningOfPeriod, String endingOfPeriod) throws ParseException {
       int number = 0;
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date beginning = format.parse(beginningOfPeriod);
        Date ending = format.parse(endingOfPeriod);
        for (Order order : orderList) {
            Date date = format.parse(order.getDateOrder());
            if (order.getStatus().equals(Order.Status.DONE) && (date.after(beginning)) && (date.before(ending))) {
                number++;
            }
        }
        System.out.printf("Number of completed orders over a period of time "+number+" since "+beginningOfPeriod +" to "+endingOfPeriod);
    }
    public void BooksNotSoldOverPeriod(List<Book> bookList,List<Order>orderList, String beginningOfPeriod, String endingOfPeriod ) throws ParseException {
        List<Integer> sold = new ArrayList<>();
        List<Integer> bookId = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date beginning = format.parse(beginningOfPeriod);
        Date ending = format.parse(endingOfPeriod);
        for (Order order : orderList){
            Date date = format.parse(order.getDateOrder());
            if(date.after(beginning) && date.before(ending)){
                sold.add(order.getIdBook());
            }
        }
        for(Book book : bookList){
            bookId.add(book.getId());
        }
        bookId.removeAll(sold);
        for(Book book : bookList){
            if(Objects.equals(bookId,book.getId())){
                System.out.printf("\n"+book);
            }
        }
    }
}
