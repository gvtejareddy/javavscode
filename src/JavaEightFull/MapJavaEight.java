package JavaEightFull;

import java.util.HashMap;
import java.util.Map;

public class MapJavaEight {
    

    Map<Integer,String> student = new HashMap<>();

    {
        student.put(1,"Teja");
        student.put(2, "Vinod");
    }
    
    public static void main(String[] args) {
        MapJavaEight mapJavaEight = new MapJavaEight();
        mapJavaEight.student.entrySet().stream().forEach((x)->{
            System.out.println(x.getKey()+" "+x.getValue());
        });

        mapJavaEight.student.keySet().forEach(x-> System.out.println(x.intValue()));
        mapJavaEight.student.entrySet().stream().forEach((x)->{System.out.println(x.getKey()+" "+x.getValue());});
    }
}
