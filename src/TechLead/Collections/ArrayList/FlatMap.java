package TechLead.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
  Arrays.asList("a"),
  Arrays.asList("b"));
System.out.println(list);

            System.out.println(list
            .stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList()));

            List<Integer> myList = new ArrayList<>();
            myList.add(1);
            myList.add(2);
            myList.add(4);


            Integer myint = myList.stream().reduce(4,(a,b)->a+b);
            System.out.println(myint);
    }
    
}
