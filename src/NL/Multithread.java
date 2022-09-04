package NL;

public class Multithread {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int count=0;
            Thread th = new Thread(new Runnable() {
               
                @Override
                public void run() {
                    System.out.println("Print");
                    
                }
              
            });
            th.start();
        }
    }
}