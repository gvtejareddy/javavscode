package interviewpack.Inheritance;

public class InheritanceMain {
    
    public static void main(String[] args) {

        Aeroplane aeroplane = new AirbusAeroPlan(2,"Red","airbus");

        

        System.out.println(aeroplane.fly());

        AirbusAeroPlan newAirbusAeroPlan = new AirbusAeroPlan(5,"Blue","Fighter");
        newAirbusAeroPlan.getAllAeroPlanStats();

        
        
    }
}
