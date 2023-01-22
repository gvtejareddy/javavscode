package TechLead.FunctionalInterface;


@FunctionalInterface
public interface FunctioanlInterfaceOne {

    void display();
     
    static void  newDisplay(){
    System.out.println("test");
}
    
}

class myRun{

    public static void main(String[] args) {
        
    FunctioanlInterfaceOne myNew = ()->{
    System.out.println("display");
    };

    myNew.display();

    FunctioanlInterfaceOne fone= new FunctioanlInterfaceOne(){
        @Override
        public void display() {
            // TODO Auto-generated method stub
            
        }
    
    };
    
}
}