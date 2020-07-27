package hackerrank;

import java.util.Scanner;

public class practwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int finalVal = 0;
            for (double j = 0.0; j < n; j++) {
                if (j == 0.0) {
                    finalVal = (int) (a + (Math.pow(2.0, j)) * b);
                } else {
                    finalVal = (int) (finalVal + (int) ((Math.pow(2.0, j)) * b));
                }
                System.out.print(finalVal + " ");
            }
            System.out.println();
        }
        in.close();
    }
}