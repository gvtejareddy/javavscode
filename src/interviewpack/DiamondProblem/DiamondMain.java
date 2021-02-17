package interviewpack.DiamondProblem;

public class DiamondMain implements InterfaceA, InterfaceB {

    public void display() {
        InterfaceA.super.display();
        // or,
        InterfaceB.super.display();
    }

    public static void main(String[] args) {

        DiamondMain diamondMain = new DiamondMain();

        diamondMain.display();

    }

}
