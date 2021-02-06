package interview.BicycleInheritance;

public class Bicycle {

    public int gear;
    public int speed;

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public String bicycleInfo()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    } 
}
