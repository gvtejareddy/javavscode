package interview.AbstractClass;

public class Swan extends Animal{

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Swan";
    }
    public void eat(){

        System.out.println("Override eat");
    }
    
    public void runget(){
     eat();   
    }
}
