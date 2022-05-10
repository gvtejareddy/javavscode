package interview;

import java.util.ArrayList;
import java.util.List;

class PrivateClass { // Declaring private throws error
    
    public static Integer value=null;
    

    //public static int valueInt = null; // error


    public static void main ( String args[]){
        List<Double> myList = new ArrayList<Double>();
        myList.add(50.50);
        Integer x=0;
        System.out.println(value);
        x=x++;
        System.out.println(x);

    }
}
