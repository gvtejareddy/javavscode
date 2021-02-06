package interview.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStudent {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("teja",100));
        students.add(new Student("vinod",10));

        students.add(new Student("yamuna",50));
        students.add(new Student("parvathi",1000));

        Collections.sort(students);

        students.stream().forEach((o)->{
            System.out.println(o.getScore());
        });

    }
    
}
