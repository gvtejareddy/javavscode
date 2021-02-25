package interviewpack.Abstraction;

public abstract class DisplayAbstarctClass {

    public void displayNonAbstract() {
        System.out.println("display");
    };

    public abstract String display();

    public abstract void displayVoid();

    public final void displayFinal() {
        System.out.println("Display Final");
    };

    private String newnumber = "10";

}

// only have have public or protected
