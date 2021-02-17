package interviewpack.Inheritance;

public class AirbusAeroPlan extends Aeroplane {

    private String type;

    public AirbusAeroPlan(int Engines, String color, String type) {
        super(Engines,color);
        this.type = type;
    }

    public void getAllAeroPlanStats() {

        System.out.println(fly() + " and with  " + type);
    }

}
