package hackerrank;

import java.util.Scanner;

public class pracfive {

    static Scanner sc = new Scanner(System.in);

    static int B = sc.nextInt();
    static int H = sc.nextInt();
    public static boolean flag = initFlag();


    public static boolean initFlag() {
        if (B > 0 && H > 0) {
            return true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}