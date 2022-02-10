package TechLead.ProgrammingQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateChars {

    public static void main(String[] args) {

        String myStr = "zaazbbzc";

        getDuplicat(myStr);
        // for(int i=0;i<myStr.length();i++){

        // for( int j=i+1;j<myStr.length();j++){
        // if(myStr.charAt(i)==myStr.charAt(j)){

        // System.out.println(myStr.charAt(j));
        // break;
        // }
        // }

        // }
    }

    static void getDuplicat(String myStr) {

        Set<String> mySet = new HashSet<String>();

        char[] myStrArry = myStr.toCharArray();

        for (char c : myStrArry) {

            if (mySet.add(Character.toString(c))) {

            } else {

                System.out.println(c + " duplicate");
            }

        }

    }

}
