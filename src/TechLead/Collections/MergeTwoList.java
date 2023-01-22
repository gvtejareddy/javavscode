package TechLead.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import TechLead.Collections.ArrayList.Employee;
import TechLead.Collections.ArrayList.Student;




public class MergeTwoList {
    
    public static void main(String[] args) {
        
        List<Employee> newList = new ArrayList<Employee>();
        List<Student> newListStudent = new ArrayList<Student>();

        newList.add(new Employee(1, "teja"));
        newList.add(new Employee(2, "vinod"));
        newList.add(new Employee(3, "yamuna"));

      
        newListStudent.add(new Student(1, "teja"));
        newListStudent.add(new Student(6, "vinod"));
        newListStudent.add(new Student(4, "yamuna"));


        List<Employee> completServersInfo = newList.stream()
        .map((server1 -> {
            Student matchingServer = newListStudent.stream()
              .filter(server2 -> server2.getId().equals(server1.getEmpid()))
              .findFirst()
              .orElse(null);
           return server1;
        }))
        .collect(Collectors.toList());

        List<Employee> mergeTwoList = newList.stream().filter(x-> {
        Optional<Student> emp = newListStudent.stream().map(y->y).findFirst();
        return emp.get() != null;
        }).collect(Collectors.toList());
        mergeTwoList.forEach(x->System.out.println(x.getName()));
    }
}
