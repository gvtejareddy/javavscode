package TechLead.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOne {

    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<>();

        Integer myarray[] = {12,13};

        List<Integer> newList = Arrays.asList(myarray);

        newList.stream().forEach((x)-> System.out.println(x));
        Integer myArray[]= (Integer[])newList.toArray();
    }
    
}
