package interviewpack.Polymorphism;

public class PolymorphismMain {

    public static void main(String[] args) {

        AnimalPoly animalPoly = new LionPoly();
    

        //animalPoly.print(); errorred cant access private method

        animalPoly.getClassIn();
        animalPoly.getClassOut();

        System.out.println(animalPoly.getClassIn(2, 3));

        LionPoly lionPoly = new LionPoly();
        System.out.println(lionPoly.getClassIn(2, 3));
        System.out.println(lionPoly.getClassIn(2));

    }
}
