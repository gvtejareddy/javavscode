package leetcode;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {
        
        int[] twoSum =new int[2];
        
        for( int i=0;i<=nums.length ;i++){

                for (int j=i+1;j<nums.length;j++){

            if( nums[i]+nums[j] == target){
                twoSum[0]=i;
                twoSum[1]=j;
            }            
            
                }                   
        }

        return twoSum;
        
    }

    public static void main(String[] args) {
        int[] nums={3,3};

        int[] two=twoSum(nums,6);

        for(int i =0 ;i<two.length;i++){

            System.out.println(two[i]);
        }
    }
    
}
