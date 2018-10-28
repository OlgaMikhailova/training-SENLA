import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
    public static String DateNow(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return formatForDateNow.format(dateNow);
    }
}
