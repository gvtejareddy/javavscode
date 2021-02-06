package interview.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStudentCustom {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("teja", 100));
        students.add(new Student("vinod", 10));

        students.add(new Student("yamuna", 50));
        students.add(new Student("parvathi", 1000));

        StudentComparator studentComparator = new StudentComparator();

        Collections.sort(students, studentComparator);

        students.stream().forEach((o) -> {
            System.out.println(o.getScore());
        });

        SortingStudentByName sortingStudentByName = new SortingStudentByName();
        Collections.sort(students, sortingStudentByName);

        students.stream().forEach((o) -> {
            System.out.println(o.getName());
        });

    }

}
