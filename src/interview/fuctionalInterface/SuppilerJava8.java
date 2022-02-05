package interview.fuctionalInterface;

import java.util.function.Supplier;

public class SuppilerJava8 {

    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "a"; // no argument but return a value

       System.out.println( supplier.get());


    }
    
}
