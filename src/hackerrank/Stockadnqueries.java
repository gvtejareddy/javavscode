package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stockadnqueries {
    
    public static List<Integer> predictAnswer(List<Integer> stockData, List<Integer> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
    
        for(Integer query : queries) {
            int index = -1;
            Integer key = stockData.get(query-1); 
            int left = query-2, right = query;
            
            while(left >= 0 && right < stockData.size()) {
                if(stockData.get(left) < key) {
                    index = left+1;
                    break;
                } else if(stockData.get(right) < key) {
                    index = right+1;
                    break;
                }
                left--;
                right++;
            }  
            if(index == -1) {
                while(left >= 0) {
                    if(stockData.get(left) < key) {
                        index = left+1;
                        break;
                    }
                    left--;
                }
                while(right < stockData.size()) {
                    if(stockData.get(right) < key) {
                        index = right+1;
                        break;
                    }
                    right++;
                }
            }
            result.add(index);
        }
        
        return result;
    
    
        }
        public static void main(String[] args) {
            List<Integer> stockData = Arrays.asList(5,6,8,4,9,10,8,3,6,4);
            List<Integer> queries = Arrays.asList(6,5,4);
            System.out.println(predictAnswer(stockData, queries));
        }
            
}
