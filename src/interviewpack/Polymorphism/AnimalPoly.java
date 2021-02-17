package interviewpack.Polymorphism;

public class AnimalPoly {

    private void print() {
        System.out.println("Print Animal");
    }

    void getClassOut() {

        System.out.println("Animal Class OUT called");
    }

    void getClassIn() {

        System.out.println("Animal class IN CALLED");
    }

    Integer getClassIn(int count, int plusOne) {

        return count + plusOne;
    }
}
