package interview.BicycleInheritance;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public String getAllStats() {
        return bicycleInfo() + " seat height : " + seatHeight;
    }
}
