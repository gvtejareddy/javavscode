package hackerrank;

import java.util.Arrays;
import java.util.List;

public class HighlyProfitable {
    static int count (List<Integer> stockPrices,int k ){

        int n = stockPrices.size();
        int count =0; int sum=0;
        for(int i=0;i<=n-k;i++){
            sum=0;
            for(int j=i;j<(i+k)-1;j++){
                if(stockPrices.get(j)<stockPrices.get(j+1))
                sum++;
            }
            if(sum==k-1)
        count++;
        
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        List<Integer> stockPrices=Arrays.asList(1,2,3,4);
        System.out.println(count(stockPrices, 4));
        
    }
}

