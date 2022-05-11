package leetcode;

public class TwoDarray {

   

    public static void runTwoDarray() {
        int[][] arr = { { 10, 20, 30, 40 }, {11, 21, 31, 41 } };
        System.out.println(arr.length);
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        runTwoDarray();
    }

}
