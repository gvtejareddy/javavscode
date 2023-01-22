package JavaEightFull;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeJavaEntity> {

    public int compare(EmployeeJavaEntity emp1, EmployeeJavaEntity emp2) {

        if (emp1.getFirstName().compareTo(emp2.getFirstName()) > 0) {
            return 1;
        } else if (emp1.getFirstName().compareTo(emp2.getFirstName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }


}
