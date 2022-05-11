package hackerrank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class Points {
    
    public static void main(String[] args) {
        
        int a = -9;
        System.out.println(Math.abs(a));
        System.out.println(a);

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
                List<Integer> myList = new ArrayList<Integer>();
                
                myList.add(0);
                myList.add(0);
                
                for(int i=0;i<a.size();i++){

                if(a.get(i)>b.get(i)){
                myList.set(0,(myList.get(0))+1);
                }
                else if(a.get(i)<b.get(i)){
                myList.set(1,(myList.get(1))+1);
                }
                }
    
                return myList;
        
        }
}
