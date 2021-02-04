package interview.StaticPack;

public class StaticVarMethodTwo {

    public  static void staticMethod(){

        System.out.println("static method");
    }
    public void cantAccessMethod(){
        System.out.println("cant access method");

    }
    
    public static void main(String[] args) {
        staticMethod();
        //cantAccessMethod(); cant access without object in static method 

        StaticVarMethodTwo smt = new StaticVarMethodTwo();
        smt.cantAccessMethod();
    }
}


// static method
// cant access method