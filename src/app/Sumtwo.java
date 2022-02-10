package app;

import java.util.HashMap;
import java.util.Map;

public class Sumtwo {
    
        static int[] getTargetSum(int[] numArray, int target) {
         
            Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
            for(int i=0; i<numArray.length; i++){
                if(newMap.containsKey(numArray[i])){
                    return new int[]{newMap.get(numArray[i]), i};  //
                }else{
                    newMap.put(target-numArray[i], i);  // new map {9-1,0 } (8,0)
                }
            }
         
            return new int[]{0,0};
        }
        public static void main(String args[])
        {
            //2,11,15,7 
            int [] a = {1,8,15,7};
            int target = 10;
            int finalIndex[]=getTargetSum(a , target);
            for(int x : finalIndex)
                System.out.print(x + " ");
        }
    



}
