package interviewpack.Inheritance;

public class Aeroplane {

    private int Engines;

    private String color;

    public Aeroplane(int engines, String color) {
        this.Engines = engines;
        this.color = color;
    }

    public String fly() {
        return "fly with engines " + Engines + " having  color " + color;
    }

}
