package Overseas;


public class OverseasMultiThreading implements Runnable {
    Integer count =0;
   
    @Override
    public void run() {
   
        count=count+1;
        System.out.println("print"+ count);
    }

    public static void main(String[] args) {
        OverseasMultiThreading newRunnable = new OverseasMultiThreading();

        OverseasMultiThreading newRunnableOne = new OverseasMultiThreading();

        Thread  newThread = new Thread(newRunnable);
        Thread  newThreadNew = new Thread(newRunnable);

        newRunnable.run();
        newRunnableOne.run();
        newThread.start();
        newThreadNew.start();

    }
    
}
