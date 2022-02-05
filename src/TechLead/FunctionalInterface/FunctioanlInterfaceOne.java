package TechLead.FunctionalInterface;


@FunctionalInterface
public interface FunctioanlInterfaceOne {

    void display();
    
}

class myRun{

    public static void main(String[] args) {
        
    FunctioanlInterfaceOne myNew = ()->{
    System.out.println("display");
    };

    myNew.display();

    }
}