import java.util.Comparator;
import java.util.List;

public class ReservationComparator implements Comparable<ReservationBook> {
    private int id;
    @Override
    public int compareTo(ReservationBook o) {
        return this.id- o.getIdReservation();
    }
    public static Comparator<ReservationBook> NameComparator = new Comparator<ReservationBook>() {
        @Override
        public int compare(ReservationBook e1, ReservationBook e2) {
            return e1.getNameBook().compareTo(e2.getNameBook());
        }
    };
   public static Comparator<ReservationBook> NumberComparator = new Comparator<ReservationBook>() {
        @Override
        public int compare(ReservationBook e1, ReservationBook e2) {
            return (int) (e1.getNumber() - e2.getNumber());
        }
    };
    public static Comparator<ReservationBook> IdComparator = new Comparator<ReservationBook>() {
        @Override
        public int compare(ReservationBook e1, ReservationBook e2) {
            return  (e1.getIdReservation() - e2.getIdReservation());
        }
    };

}
