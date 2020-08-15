package baeldung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class nulllist {

    public static void main(String[] args) {

        List<String> nullList = new ArrayList<String>();
        nullList.add(null);
        nullList.add("10");
        nullList.stream().forEach((c) -> System.out.println(c));
        nullList.removeIf((c) -> c == null);
        nullList.stream().forEach((c) -> System.out.println(c));
        nullList.add(null);
        nullList.add("20");
        nullList.stream().forEach((c) -> System.out.println(c));
        List<String> newList = nullList.stream().filter(c -> c !=null).collect(Collectors.toList());
        nullList.stream().forEach((c) -> System.out.println(c));
        newList.stream().forEach((c) -> System.out.println("newlist"+c));
    }

}