package baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class bal1 {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("teja");
        ls.add("vinod");
        System.out.println(ls);
        System.out.println(ls.size());
        ls.add(1, "veera");
        System.out.println(ls);
        System.out.println(ls.size());

        for (String string : ls) {
            System.out.println(string);
        }
        ListIterator<String> ltr = ls.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }

        // search
        ListIterator<String> ltrOne = ls.listIterator();

        while (ltrOne.hasNext()) {
            String s = ltrOne.next();
            if (s.equals("teja")) {
                System.out.println(s);
                break;
            }
        }
        ls.stream().forEach((c) -> System.out.println("val:" + c));
        // ls.removeIf(p -> p.equals("teja"));
        ls.stream().forEach((c) -> System.out.println("val:" + c));

        List<String> umod = ls;
        umod.add("yummy");
        umod.stream().forEach((c) -> System.out.println("unmodval:" + c));

        // immutable
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        list.add("four");

        unmodifiableList.stream().forEach((c) -> System.out.println("immutable:" + c));

        // 2d

        List<ArrayList<String>> la = new ArrayList<ArrayList<String>>();
        la.add(new ArrayList<String>(Arrays.asList("a", "c", "9")));

        la.get(0).add("1");
        la.stream().forEach((c)->System.out.println(c));

        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());

        List<String> nullList = new ArrayList<String>();

        nullList.add(null);
    }
}