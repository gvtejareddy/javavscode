package JavaEightFull;

import java.util.HashMap;
import java.util.Map;

public class MapSortComparator {


    Map<Integer ,EmployeeJavaEntity> employeeMap = new HashMap<>();

    
    {

        employeeMap.put(1,new EmployeeJavaEntity(1,"Teja","Reddy"));
        employeeMap.put(2,new EmployeeJavaEntity(2,"Vinod","Reddy"));
        employeeMap.put(3,new EmployeeJavaEntity(3,"Yamuna","Gowru"));
        employeeMap.put(4,new EmployeeJavaEntity(4,"Sai","Kiran"));
    }
    public static void main(String[] args) {
        

        MapSortComparator mapSortComparator = new MapSortComparator();
        mapSortComparator.employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(new EmployeeComparator())).forEach(x->System.out.println(x.getKey()+" "+x.getValue().getFirstName()));;

    }
}
