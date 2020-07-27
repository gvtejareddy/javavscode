package hackerrank;
import java.util.Scanner;

public class practtwe {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        String A = a.toLowerCase();
        String B = b.toLowerCase();

        String[] aArray = A.split("");
        String[] bArray = B.split("");

        boolean flag = true;

        if (aArray.length == bArray.length) {
            aArray = sortArrayAs(aArray);
            bArray = sortArrayAs(bArray);
            for (int i = 0; i < aArray.length; i++) {
                if (aArray[i].equals(bArray[i]) && flag) {
                    if (getCount(aArray[i], aArray) == getCount(bArray[i], bArray)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                } else {
                    flag = false;
                }
            }

        }
        else{
            flag=false;
        }
        return flag;
    }

    static String[] sortArrayAs(String[] myArray) {
        int size = myArray.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }

        }
        return myArray;
    }

    static Integer getCount(String a, String[] b) {
        Integer count = 0;
        for (String cCOUNT : b) {
            if (cCOUNT.equals(a)) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}