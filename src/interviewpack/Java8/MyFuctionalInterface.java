package interviewpack.Java8;

@FunctionalInterface
public interface MyFuctionalInterface {

    void getMyName();

    // void getMyNametWO(); //ERROR

    default void display() {

        System.out.println("Display from my Myfunctional Interface");
    }
}
