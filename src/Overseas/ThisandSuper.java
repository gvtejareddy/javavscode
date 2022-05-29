package Overseas;

public class ThisandSuper extends NewClass {
    

    public ThisandSuper(){
        super.myName();
    }


    public static void main(String[] args) {
        ThisandSuper thisandSuper = new ThisandSuper();
        thisandSuper.myName();
    }

}


class NewClass{


public void myName(){

    System.out.println("New class");
}

}
