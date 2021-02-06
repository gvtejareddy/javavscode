package interview.ExceptionsClass;

public class Book {
    
    public static void main(String[] args) throws RuntimeException {
        
        String [] myName = new String[1];

        try{
            //System.out.println(myName[1]);
            fall();
        }
        catch(Exception e){
            System.out.println("Error occurred");
        }
        finally{

            System.out.println("Commpleted");
        }
    }

    public static void fall(){

        throw new RuntimeException();
    }
}
