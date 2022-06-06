package TechLead.ProgrammingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestToys {
    

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1 ,12 ,5 ,111 ,200 ,1000 ,10);
    
        
        System.out.println( maximumToys(myList,50));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
    
    int max = 0 ; int count=0;
    
    Collections.sort(prices);
        System.out.println(prices.toString());


    for( int i=0;i<prices.size();i++){

            max= max+prices.get(i);

            if(max<=k){
                count++;
            }
    }


    
    return count;
    
        }
}
