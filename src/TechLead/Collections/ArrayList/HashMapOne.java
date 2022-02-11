package TechLead.Collections.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {

    public static void main(String[] args) {
        

        Map<Integer,String> myMap = new HashMap<Integer,String>();


        myMap.put(1, "teja");
        myMap.put(2,"vinod");

    

        myMap.forEach((key,value)->{

            System.out.println(key+" "+value);
        });
    }
    
}
