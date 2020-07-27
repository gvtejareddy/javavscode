package hackerrank;

import java.util.Arrays;

public class practnine {

    public static void main(String[] args) {
        String str = "welcometojava";
        String smallest = "";
        String largest = "";
        int k = 3;

        String temp = "";
        // ArrayList<String> kArray = new ArrayList<String>();

        // for (int i = 0; i < str.length() - 2; i++) {
        // System.out.println(str.charAt(i));
        // kArray.add(str.substring(i, i + k));
        // }

        // Collections.sort(kArray);
        // smallest = kArray.get(0);
        // largest = kArray.get(kArray.size()-1);
        // System.out.println(smallest+" "+largest);

        for (int i = 0; i < str.length() - 2; i++) {
            temp = temp + " " + str.substring(i, i + k);
        }

        String[] newArry = temp.split(" ");


    
    }
}