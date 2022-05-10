package multithreading;

public class AppOne {
    

    public static void main(String[] args) {
        
        Runner runner = new Runner();

        runner.start();

        Runner runnerTwo = new Runner();

        runnerTwo.start();
    }
}

class Runner extends Thread{

    public void run(){
        for(int i=0;i<10;i++){

            System.out.println("hello "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
