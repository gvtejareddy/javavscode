package Overseas;

public class OverseasDeadlock {



    public static void main(String[] args) throws InterruptedException {
        
    Integer firstInt = 10;
    Integer secondInt=20;
        Thread threadOne = new Thread( new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
    
                synchronized(firstInt){
    
                    System.out.println("thread 1 locked firstint");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    synchronized(secondInt){
                        System.out.println("thread 1 locked secondInt");
                    }
                }
                
            }
           
            
    
            
        });

        Thread threadtwo = new Thread( new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                synchronized(secondInt){
    
                    System.out.println("thread 2 locked secondInt");
    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
    
                    synchronized(firstInt){
                        System.out.println("thread 2 locked firstInt");
                    }
                }
                
            }
           
            
    
            
        });
        threadOne.start();
        threadtwo.start();
        threadOne.join();
       

    }



    

    
}
