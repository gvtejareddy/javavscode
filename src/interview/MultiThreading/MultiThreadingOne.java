package interview.MultiThreading;

class MultiThreading extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}

public class MultiThreadingOne {

    public static void main(String[] args) {
        MultiThreading mut = new MultiThreading();
        mut.start();

        MultiThreading mut2 = new MultiThreading();
        mut2.start();


    }
}