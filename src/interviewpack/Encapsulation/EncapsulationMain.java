package interviewpack.Encapsulation;

public class EncapsulationMain {
    
    public static void main(String[] args) {
        
        EmployeeEn empEn = new EmployeeEn("Teja",122222);

        System.out.println(empEn.getName());

        System.out.println(EmployeeEn.newName());

        System.out.println( empEn.getId());
    }
}
