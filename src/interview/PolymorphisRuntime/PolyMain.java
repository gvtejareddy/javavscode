package interview.PolymorphisRuntime;

public class PolyMain {

    public static void main(String[] args) {
        
        ParentPoly pChildOne = new ChildOnePoly();

        pChildOne.getClassIn();

        pChildOne.getClassOut();
        pChildOne= new ChildTwoPoly();
        pChildOne.getClassOut();
    }
    
}
