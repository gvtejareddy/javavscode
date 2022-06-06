package JavaEightFull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorJavaEight {

    List<Books> books = new ArrayList<>();

    {
        books.add(new Books(1,"Java",200));
        books.add(new Books(2,"Hibernate",300));
        books.add(new Books(3,"Spring",100));

    }
    public static void main(String[] args) {

        ComparatorJavaEight comparatorJavaEight = new ComparatorJavaEight();

        System.out.println(comparatorJavaEight.books.toString());
        Collections.sort(comparatorJavaEight.books,(x,y)->x.getName().compareTo(y.getName()));

        System.out.println(comparatorJavaEight.books.toString());
        
    }
    
}
