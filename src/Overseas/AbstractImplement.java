package Overseas;

public class AbstractImplement extends OverSeasAbstractClass {

    @Override
    public void display() {
        // TODO Auto-generated method stub

        System.out.println("Abstarct display");
        
    }

    OverSeasAbstractClass overSeasAbstractClass;

    public static void main(String[] args) {
        OverSeasAbstractClass overSeasAbstractClass = new OverSeasAbstractClass() {

            @Override
            public void display() {
                // TODO Auto-generated method stub
                System.out.println("help");
                
            }

            @Override
            public void impl() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void displayone() {
                // TODO Auto-generated method stub
                
            }
            
        };
        overSeasAbstractClass.display();
        
    }

    @Override
    public void impl() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void displayone() {
        // TODO Auto-generated method stub
        
    }
    
}
