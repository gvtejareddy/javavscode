package JavaEightFull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUsingStreams {
   static List<Integer> myList = Arrays.asList(100,20,30);


    public static void main(String[] args) {

        myList.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
        
    }
}
