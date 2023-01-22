package interviewsettwo;

public class TestAbstractA extends AbstractA {

    @Override
    public void display() {
       System.out.println("Display");
        
    }
    public static void main(String[] args) {
        TestAbstractA testAbstractA = new TestAbstractA();
        testAbstractA.display();
    }
    
}
