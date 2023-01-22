package JavaEightFull;

import java.util.Arrays;
import java.util.List;

public class SumJavaEight {

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(10,20,30);

       System.out.println( mylist.stream().mapToInt(x->x).sum());

     Integer myInt=  mylist.stream().reduce(10,(x,y)->x+y);
     System.out.println(myInt);
       System.out.println(mylist.stream().reduce(10,(x,y)->x+y));
       
       System.out.println(mylist.stream().reduce(10,(x,y)->x*y));

       System.out.println(mylist.stream().reduce(0,(x,y)-> x>y ? x :y));
    System.out.println(mylist.stream().reduce(Integer::max).get());

    }
}
