package baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeduplicate {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 20, 20, 40, 10, 30);

        myList.stream().forEach((c) -> System.out.println("duplicate"+c));

        List<Integer> myListWithoutDuplicate = new ArrayList<>(new HashSet<>(myList));

        myListWithoutDuplicate.stream().sorted().forEach((c) -> System.out.println("No duplicate" + c));

    }

}