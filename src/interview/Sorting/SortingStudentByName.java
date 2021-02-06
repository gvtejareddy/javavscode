package interview.Sorting;

import java.util.Comparator;

public class SortingStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub

        if ((o1.getName()).compareTo(o2.getName()) > 1) {
            return -1;
        } else if ((o1.getName()).compareTo(o2.getName()) < 1) {
            return 1;
        } else {
            return 0;
        }

    }

}
