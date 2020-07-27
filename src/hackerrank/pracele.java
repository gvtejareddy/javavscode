package hackerrank;

import java.util.Scanner;

public class pracele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean flag = true;           
            for (int i = 0; i <= A.length() / 2; i++) {
                if (flag) {
                    if (A.charAt(i) == A.charAt(A.length() - (i+1))) {
                        flag = true;
                    } else {
                        flag = false;
                        System.out.println("No");
                    }
                }
            }
        if (flag) {
            System.out.println("Yes");
        }
    }

}