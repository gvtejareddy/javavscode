package interviewpack.Abstraction;

public class AbstractionMain {

    public static void main(String[] args) {

        DisplayAbstarctClass abstractionMain = new DisplayAbstarctClass(){

            @Override
            public String display() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void displayVoid() {
                // TODO Auto-generated method stub

            }
            
        };
        DisplayAbstarctClass displayAbstarctClass= new DisplayAbstarctClass(){

            @Override
            public String display() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void displayVoid() {
                // TODO Auto-generated method stub

            }
            
            
        };

        displayAbstarctClass.displayNonAbstract();
        displayAbstarctClass.displayFinal();

    }

}
