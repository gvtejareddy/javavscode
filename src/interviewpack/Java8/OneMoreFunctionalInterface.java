package interviewpack.Java8;

public interface OneMoreFunctionalInterface {

    void displayOneMore();

    default void display() {

        System.out.println("Display from my ONE MORE Myfunctional Interface");
    }

    Integer multiple(Integer a);
}
