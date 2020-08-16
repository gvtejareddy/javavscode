package baeldung;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class baltreemap {

    public static void main(String[] args) {
        Map<Integer, Customer> newTreeCustomer = new TreeMap<Integer, Customer>(Comparator.reverseOrder());

        newTreeCustomer.put(2, new Customer(10, "teja", "hyd"));
        newTreeCustomer.put(1, new Customer(12, "Vinod", "hyd"));
        newTreeCustomer.put(0, new Customer(13, "Yamuna", "hyd"));
        newTreeCustomer.put(0, null);
        newTreeCustomer.put(5, null);

        // newTreeCustomer.put(null, new Customer(13, "Yamuna", "hyd"));
        // newTreeCustomer.put(null, new Customer(13, "Yamuna", "hyd")); tree map cannot have any/one null key 

        newTreeCustomer.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}