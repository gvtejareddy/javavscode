package baeldung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class balsorthashmap {

    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
 
        Employee employee1 = new Employee(1L, "Mher");
        map.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map.put(employee3.getName(), employee3);
        Employee employee4 = new Employee(2L, "George");
        map.put(employee4.getName(), employee4);

        
        map.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });

        List<Employee> employeeById = new ArrayList<>(map.values());
        
        System.out.println(employeeById);
        Map<String, Employee> treeMap = new TreeMap<>(map);

          
        treeMap.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });


    }
}