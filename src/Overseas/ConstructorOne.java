package Overseas;

public class ConstructorOne {

    public ConstructorOne() {
        System.out.println("Constructor called");
    }
   
   static {
        System.out.println("myname");
    }
    public static void main(String[] args) {
        ConstructorOne conOne = new ConstructorOne();
      


    }
    
}
