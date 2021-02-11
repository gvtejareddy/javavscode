package interview.Java8;

import java.util.HashMap;
import java.util.Map;

class StreamMerge {
    private static Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args) {
        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        Map<String, Employee> newMapEmp = new HashMap<String, Employee>(map1);

        map2.forEach((key, value) -> newMapEmp.merge(key, value, (v1, v2) -> new Employee(v1.getId(), v2.getName())));

        newMapEmp.forEach((key,value)->{
            System.out.println(key +" "+value);
        });

    }
}