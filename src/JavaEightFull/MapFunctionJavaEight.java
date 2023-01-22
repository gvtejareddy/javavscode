package JavaEightFull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapFunctionJavaEight {

    public static void main(String[] args) {
        List<EmployeeJavaEntity> employees = new ArrayList<>();
        employees.add(new EmployeeJavaEntity(1,"Teja","Reddy"));
        employees.add(new EmployeeJavaEntity(2,"Vinod","Reddy"));
        employees.add(new EmployeeJavaEntity(3,"Yamuna","Gowru"));
        employees.add(new EmployeeJavaEntity(4,"Sai","Kiran"));
        
        List<String> myMap = employees.stream().map(x->x.getFirstName()).collect(Collectors.toList());
        myMap.stream().forEach(x->System.out.println(x));
        List<EmployeeJavaEntity> sortedList = employees.stream().sorted(new EmployeeComparator()).collect(Collectors.toList());
        sortedList.stream().forEach(x->System.out.println(x.getFirstName()));
    }
    
}
