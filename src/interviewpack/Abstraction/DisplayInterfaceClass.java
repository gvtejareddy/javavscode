package interviewpack.Abstraction;

public interface DisplayInterfaceClass {

    public String myname="10";
    public void displayNonAbstract() throws RuntimeException;

    public abstract String display();

    public abstract void displayVoid();

    public void displayFinal();


    public static void displayStaticFinal() {
        System.out.println("get all");
    }
}

// only public, abstract, default, static and strictfp are permitted
