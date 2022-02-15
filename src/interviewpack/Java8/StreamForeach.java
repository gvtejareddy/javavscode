package interviewpack.Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamForeach {

    public static void main(String[] args) {

        Map<String, Integer> newMap = new HashMap<String, Integer>();

        newMap.put("a", 12);
        newMap.put("a", 12);
        newMap.put("a", 12);

        Map<String, Integer> myMap = newMap.entrySet().stream().filter((value) -> {
            return !value.getKey().endsWith("b") ? true : false;
        }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        myMap.entrySet().stream().forEach((a) -> {

            System.out.println(a);
        });

        List<Integer> newList = Arrays.asList(10, 12, 15);

        newList = newList.parallelStream().map((a) -> a + 10).collect(Collectors.toList());

        newList.stream().forEach((a) -> {

            System.out.println(a);
        });

        Integer result = newList.stream().reduce(2,(a,b)->a+b);
        System.out.println("resut"+result);

myMap.entrySet().stream().forEach((key)->{

    System.out.println(key.getKey() +" "+key.getValue());
});
        
    }
}
