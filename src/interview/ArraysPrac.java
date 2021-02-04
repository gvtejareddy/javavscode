package interview;

import java.util.Arrays;

public class ArraysPrac {

    public static void main(String[] args) {
        
        String [] myName ={"Teja","Reddy","Vinod"};

        int[] numbers = {12,14,6,8};
        Arrays.sort(numbers);

        for ( int i : numbers){
            System.out.println(i);
        }
        
        for ( String i : myName){
            System.out.println(i);
        }
    }
    
}
