package Utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class DateUtil {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date dateone = new Date("Jan/02/2024");
        LocalDate date = dateone.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();
    System.out.println(DateTimeFormatter.ofPattern("dd MMM", Locale.ENGLISH).format(date));




    }
    
}
