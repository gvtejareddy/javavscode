package TechLead.ProgrammingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramOne {

    public static void main(String[] args) {
        System.out.println(isAnagram("secure", "sesuce"));

    }

    public static boolean isAnagram(String a, String b) {

        // secure // resuce

        String[] aString = a.split("");
        String[] bString = b.split("");
        boolean isAnagram=false;

        if (aString.length == bString.length) {
            Arrays.sort(aString);
            Arrays.sort(bString);
            if (Arrays.deepEquals(aString, bString)) {
                isAnagram= true;
            }
            else{
                isAnagram=false;
            }
            
        }
        return isAnagram;

    }

}
