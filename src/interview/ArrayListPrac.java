package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrac {

    public static void main(String[] args) {
        Integer[] numbers = { 12, 14, 6, 8 };
        List<Integer> newnumbersList = Arrays.asList(numbers); // Convert array to arraylist
        List<String> list = Arrays.asList("one", "two");
        System.out.println(newnumbersList);

        newnumbersList.stream().forEach((o) -> {
            System.out.println(o);
        });


        List<Integer> newnumbersListtoAdd = new ArrayList<Integer>(Arrays.asList(numbers));
        newnumbersListtoAdd.add(30);
        newnumbersListtoAdd.stream().forEach((o) -> {
            System.out.println(o);
        });

        // convert from list to array

        Object[] newArray= newnumbersList.toArray();
        for( Object i : newArray){
            System.out.println("LIST TO ARRAY");
            System.out.println(i);
        }

    }

}
