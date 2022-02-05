package TechLead;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOneTran {

  

    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(20);

        List<Integer> newList = myList.stream().map((x)-> x+1).collect(Collectors.toList());

        newList.parallelStream().forEach((x)->System.out.println(x));


    }
    
}
