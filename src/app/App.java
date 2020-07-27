package app;

public class App {

    protected int size;
    private int age;

    public App() {
        System.out.println("Constructor of App");
    }

    public App(int age) {

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}