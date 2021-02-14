package hackerrank;

import java.util.Arrays;

public class RepeatedWords {

    public static void main(String[] args) {
        Integer count = 0;
        Integer maxCount = 0;
        String word=null;
        String s = " teja reddy teja teja reddy vinod vinod vinod reddy teja teja vinod vinod vinod ";

        String[] sArray = s.trim().split(" ");

        for (String i : sArray) {
            System.out.println(i);
        }
        Arrays.sort(sArray);
        System.out.println("After Sort /n");
        for (String i : sArray) {
            count = 0;
            for (String string : sArray) {
                if (i.equals(string)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                word = i;
            }

        }

        System.out.println(maxCount + ": " + word);
    }

}