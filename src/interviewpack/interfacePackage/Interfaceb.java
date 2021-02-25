package interviewpack.interfacePackage;


@FunctionalInterface
public interface Interfaceb {

    default void display(){
        System.out.println("Inteface 1");
    };
    
    default void myname(){
        System.out.println("name");
    }

    void mydisplay();
}
