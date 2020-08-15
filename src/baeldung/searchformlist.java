package baeldung;

import java.util.ArrayList;
import java.util.List;

public class searchformlist {

    public static void main(String[] args) {

        List<Customer> newCustomer = new ArrayList<Customer>();

        newCustomer.add(new Customer(10, "Teja", "hyd"));

        newCustomer.add(new Customer(11, "Vinod", "hyd"));

        newCustomer.add(new Customer(12, "Yamuna", "Kadapa"));

        newCustomer.stream().forEach((c) -> System.out.println(c.getName()));

       Customer teja = newCustomer.stream().filter((c)-> c.getName().equals("Teja")).findAny().orElse(null); 

       System.out.println(teja.getName());
    }
}