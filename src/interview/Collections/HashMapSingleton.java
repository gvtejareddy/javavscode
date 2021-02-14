package interview.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapSingleton {

    public static void main(String[] args) {

        Map<String, Integer> newMap = new HashMap<String, Integer>();

        newMap = Collections.singletonMap("teja", 20);
        try {
            newMap.put("key", 45);
        } catch (Exception e) {
            System.out.println(e);
        }
        newMap.forEach((key, value) -> {

            System.out.println(key + " " + value);
        });

    }

}
