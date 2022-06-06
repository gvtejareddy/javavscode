package JavaEightFull;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    

    public static void main(String[] args) {
        Supplier<String> supplier =()->{
            return "hello";
        };

        System.out.println(supplier.get());

        List<String> myList = Arrays.asList("teja","reddy");

        myList.stream().findAny().orElseGet(supplier);
    }
}
