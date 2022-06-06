package interview.AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        int[] nums1 = { 5,4,3,2,6 };
        int[] nums2 = { 3,7,4,5 };
        int[] nums3 = { 1, 4, 6, 8, 1, 9, 10, 11 };
        System.out.println(getMinCuts(nums1));
        System.out.println(getMinCuts(nums2));
        System.out.println(getMinCuts(nums3));
    }
    
    private static int getMinCuts(int[] A) {
        int count = 0;
        List<Integer> arr = new ArrayList<Integer>();
    
        ArrayList<Integer> arrt = new ArrayList<Integer>();
    
        for (int i : A) {
            arr.add(i);
        }
    
        // first check if its already in correct sequence
        boolean check = false;
        for (int j = 0; j < A.length-2 ; j++) {
            if ((arr.get(j) - arr.get(j + 1) > 0) && (arr.get(j + 1) - arr.get(j + 2) < 0)) {
                check = true;
            } else if ((arr.get(j) - arr.get(j + 1) < 0) && (arr.get(j + 1) - arr.get(j + 2) > 0)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            return 0;
        }
    
        List<Integer> ab = new ArrayList<Integer>();
    
        for (int i = 0; i < A.length; i++) {
            ab.clear();
            ab.addAll(arr);
            ab.remove(i);
            int f = 0;
            boolean okay = false;
            while (f < A.length - 3) {
                if (!okay && f != 0) {
                    break;
                }
                if ((ab.get(f) - ab.get(f + 1) > 0) && (ab.get(f + 1) - ab.get(f + 2) < 0)) {
                    okay = true;
                } else if ((ab.get(f) - ab.get(f + 1) < 0) && (ab.get(f + 1) - ab.get(f + 2) > 0)) {
                    okay = true;
                } else {
                    okay = false;
                }
                f++;
            }
            if (okay) {
                count++;
            }
        }
        if (count == 0)
            count = -1;
    
        return count;
    
}
}
