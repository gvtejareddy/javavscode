package baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class balarraytolist {

    public static void main(String[] args) {
        Integer[] a = { 10, 20, 30, 40 };

        for (Integer integer : a) {
            System.out.println(integer);
        }

        // List<Integer> newList = Arrays.asList(a);

        // newList.add(60); // cant add any since fixed sized list
        List<Integer> newList = new ArrayList<>(Arrays.asList(a));

        newList.add(60);
        newList.forEach((c) -> {
            System.out.println("Arraylist : " + c);
        });

        Integer[] b = newList.toArray(new Integer[0]);

        for (Integer integer : b) {
            System.out.println("newArray : " + integer);
        }
    }
}