package interviewpack.Java8;

public class FunctionalInterfaceMain implements OneMoreFunctionalInterface {

    public static void main(String[] args) {
        
        MyFuctionalInterface myFuctionalInterface = new MyFuctionalInterface() {
            @Override
            public void display() {
                System.out.println("Display from my Myfunctional overide display");
            }

            @Override
            public void getMyName() {
                // TODO Auto-generated method stub

            }
        };
        myFuctionalInterface.display();
        FunctionalInterfaceMain functionalInterfaceMain = new FunctionalInterfaceMain();
        functionalInterfaceMain.display();

    }

    @Override
    public void displayOneMore() {
        // TODO Auto-generated method stub

    }

    @Override
    public Integer multiple(Integer a) {
        // TODO Auto-generated method stub
        return a * a;
    }

  

}
