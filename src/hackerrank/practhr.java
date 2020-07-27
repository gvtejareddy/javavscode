package hackerrank;

import java.util.Scanner;

public class practhr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // abc
        String s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char charAtPos = s.charAt(i);
            if (charAtPos == '@' || charAtPos == '!' || charAtPos == ',' || charAtPos == '.' || charAtPos == '_'
                    || charAtPos == '\'' || charAtPos == '?') {
                s = s.replace(s.charAt(i), ' ');

            }
        }
        s = s.trim().replaceAll(" +", " ");
        System.out.println(s);
        String[] sArray = s.split(" ");
        if (sArray[0].equals(" ") || sArray[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(sArray.length);
            for (String string : sArray) {
                System.out.println(string);
            }
        }
        scan.close();
    }
}