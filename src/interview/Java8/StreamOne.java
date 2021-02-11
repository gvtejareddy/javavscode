package interview.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {

    public static void main(String[] args) {
        String[] arr = new String[] { "a", "b", "c" };

        Stream<String> newStream = Arrays.stream(arr);

        newStream.forEach((o) -> {

            System.out.println(o);
        });

        List<String> newList = new ArrayList<String>();
        newList.add("abc");

        Stream<String> newStreamList = newList.stream();

        newStreamList.forEach((o) -> {

            System.out.println(o);
        });

        System.out.println(newList.stream().count());
        System.out.println(newList.stream().anyMatch(ele -> ele.contains("c"))); // true
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        Stream<String> containList = list.stream().filter(ele -> ele.contains("d"));
        containList.forEach((o) -> {
            System.out.println(o);
        });

        List<String> anyList = list.stream().map((o) -> o + "newvalue").collect(Collectors.toList());

        anyList.forEach((o) -> {
            System.out.println(o);
        });

        Stream<String> newParrelleStream = anyList.parallelStream();

        newParrelleStream.forEach((o)-> System.out.println(o));

    }
}
