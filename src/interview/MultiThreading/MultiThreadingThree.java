package interview.MultiThreading;

public class MultiThreadingThree {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
        
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
        
        });
        t1.start();
    }
    
}
