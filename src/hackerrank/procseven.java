package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;

public class procseven {

    public static void main(String[] args) {
       String myString = NumberFormat.getCurrencyInstance(Locale.US).format(20);
       System.out.println(myString);
 
    }
    
}