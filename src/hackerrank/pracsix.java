package hackerrank;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class pracsix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] newArray = s.split(" ");

        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        calendar.set(Integer.parseInt(newArray[2]), Integer.parseInt(newArray[0]), Integer.parseInt(newArray[1]));

        System.out.println((new SimpleDateFormat("EEEE").format(calendar.getTime())).toUpperCase());

        sc.close();

    }

}