package hackerrank;

import java.util.Scanner;

public class practen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        Integer length = A.length() + B.length();
        System.out.println(length);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A=A.substring(0, 1).toUpperCase() + A.substring(1);
        B=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A+" "+B);
        sc.close();
    }

}