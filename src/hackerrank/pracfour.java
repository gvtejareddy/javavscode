package hackerrank;

import java.util.Scanner;

public class pracfour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer count = 1;
        while (sc.hasNext()) {
            System.out.println(count + " " + sc.nextLine());
            count++;
        }
        sc.close();
    }

}