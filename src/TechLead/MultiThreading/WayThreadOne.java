package TechLead.MultiThreading;

public class WayThreadOne extends Thread {
    
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class ThreadApp
{
    public static void main(String[] args) {
        
        WayThreadOne wayThreadOne= new WayThreadOne();
        wayThreadOne.start();
        WayThreadOne wayThreadOneTwo= new WayThreadOne();
        wayThreadOneTwo.start();


    }
}