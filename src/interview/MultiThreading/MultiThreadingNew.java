package interview.MultiThreading;

public class MultiThreadingNew {

    public static void main(String[] args) {
        Thread th =  new Thread(()->{
            System.out.print("test");
        });
        try {
            th.sleep(10000,10000);
            th.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
