package interviewpack.Polymorphism;

public class LionPoly extends AnimalPoly {
    
    public void print() {
        System.out.println("Print Animal");
    }
  
    void getClassIn(){

        System.out.println("Lion class IN CALLED");
    }

    Integer getClassIn(int count){

        return count;
    }
    
}
