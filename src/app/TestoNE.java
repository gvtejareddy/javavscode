
package app;

import java.util.Arrays;

public class TestoNE{
    public static void main(String args[]) {
        int[] array = {10, -10,  -1, -1,10};

        System.out.println(solution(array));
    }
    public static int solution(int[] a){
        if (a.length == 0) return 0;
        if (a.length == 1) return a[0];
        int sum = 0;
        for (int i=0;i<a.length;i++) {
            a[i] = Math.abs(a[i]);
            sum += a[i];
        }
        Arrays.sort(a);
    
        int[] arr = a;
        int[] arrRev = new int[arr.length];
        int minRes = Integer.MAX_VALUE;
    
        for (int t=0;t<=4;t++) {
            arr = fold(arr);
            int res1 = findSum(arr, sum);
            if (res1 < minRes) minRes = res1;
    
            rev(arr, arrRev);
            int res2 = findSum(arrRev, sum);
            if (res2 < minRes) minRes = res2;
    
            arrRev = fold(arrRev);
            int res3 = findSum(arrRev, sum);
            if (res3 < minRes) minRes = res3;
        }
    
        return minRes;
    }
    
    private static void rev(int[] arr, int[] arrRev){
        for (int i = 0; i < arrRev.length; i++) {
            arrRev[i] = arr[arr.length - 1 - i];
        }
    }
    
    private static int[] fold(int[] a){
        int[] arr = new int[a.length];
        for (int i=0;a.length/2+i/2 < a.length && a.length/2-i/2-1 >= 0;i+=2){
            arr[i] = a[a.length/2+i/2];
            arr[i+1] = a[a.length/2-i/2-1];
        }
        if (a.length % 2 > 0) arr[a.length-1] = a[a.length-1];
        else{
            arr[a.length-2] = a[0];
            arr[a.length-1] = a[a.length-1];
        }
        return arr;
    }
    
    private static int findSum(int[] arr, int sum){
        int[] indices = new int[arr.length];
        indices[0] = 0;
        double half = Double.valueOf(sum)/2;
        int localSum = Math.abs(arr[0]);
        int minLocalSum = Integer.MAX_VALUE;
        int placeIndex = 1;
        for (int i=1;i<arr.length;i++){
            if (localSum == half)
                return 2*localSum - sum;
            if (Math.abs(2*minLocalSum-sum) > Math.abs(2*localSum - sum))
                minLocalSum = localSum;
    
            if (localSum<half){
                localSum += Math.abs(arr[i]);
                indices[placeIndex++] = i;
            }else{
                if (placeIndex > 1) {
                    localSum -= Math.abs(arr[indices[--placeIndex]]);
                    i = indices[placeIndex];
                }
            }
        }
    
        return Math.abs(2*minLocalSum - sum);
    }
}

