package JavaEightFull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapEight {

    Map<Integer , String> student = new HashMap<>();

    {
        student.put(1,"Teja");
        student.put(4, "Vinod");
        student.put(2, "Vinod");
    }
    
    public static void main(String[] args) {
        SortMapEight sortMapEight = new SortMapEight();
        // TreeMap<Integer , String> treeMap = new TreeMap<>(sortMapEight.student);

        // treeMap.entrySet().stream().forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));
        // treeMap.forEach((k, v)
        //                -> System.out.println(k + " : "
        //                                      + (v)));


    sortMapEight.student.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));

    }


}
