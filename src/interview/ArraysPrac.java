package interview;

import java.util.Arrays;

public class ArraysPrac {

    public static void main(String[] args) {
        
        String [] myName ={"Teja","Reddy","Vinod"};

        int [] [] myTwoDArray= {{2,3,4},{5,6,7}};

        int[] numbers = {12,14,6,8};
        Arrays.sort(numbers);

        for ( int i : numbers){
            System.out.println(i);
        }
        
        for ( String i : myName){
            System.out.println(i);
        }

       for( int i=0;i<myTwoDArray.length;i++){
           for( int j=0;j<myTwoDArray[i].length;j++){
               System.out.println(i+"::"+j+" "+ myTwoDArray[i][j]);
           }
       }
    }
    
}
