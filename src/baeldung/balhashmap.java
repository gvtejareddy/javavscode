package baeldung;

import java.util.HashMap;
import java.util.Map;

public class balhashmap {

    public static void main(String[] args) {

        HashMap<String, Customer> newCustomerMap = new HashMap<String, Customer>();

        newCustomerMap.put("key1", new Customer(10, "teja", "hyd"));
        newCustomerMap.put("key2", new Customer(12, "Vinod", "hyd"));
        newCustomerMap.put("key2", new Customer(13, "Yamuna", "hyd"));
        newCustomerMap.put(null, new Customer(13, "Yamuna", "hyd"));
        newCustomerMap.put(null, new Customer(14, "Parv", "hyd"));
        newCustomerMap.put(null, new Customer(15, "nara", "hyd"));
        newCustomerMap.put("key4",null);
        newCustomerMap.put("key5",null);
        newCustomerMap.put("key4",null);

        // System.out.println(newCustomerMap.toString());

        // System.out.println(newCustomerMap.get("key1"));

        // System.out.println(newCustomerMap.keySet());

        for (String keyVal : newCustomerMap.keySet()) {
            System.out.println("customervalue : "+newCustomerMap.get(keyVal));
           // System.out.println(newCustomerMap.get(keyVal).hashCode());
        }

        Map<String, Customer> newCustomerMapOne = new HashMap<String, Customer>(newCustomerMap); //avoid mutability
        newCustomerMap.put("key5", new Customer(14, "Parv", "hyd"));

        newCustomerMap.forEach((key, value) -> {

            System.out.println(key + " :" + value);

        });

        newCustomerMapOne.forEach((key, value) -> {

            System.out.println("newcustomer " + key + " :" + value);

        });
    }
}