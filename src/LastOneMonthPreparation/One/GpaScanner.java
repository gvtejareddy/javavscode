package LastOneMonthPreparation.One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GpaScanner {

    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter Number of Credits");

        // String credit = scanner.nextLine();

        // System.out.println(credit);
        // scanner.close();

        ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList("teja"));

        
        newArrayList.add("myname");
        newArrayList.add("nnn");
        System.out.println(newArrayList);
        newArrayList.add(2,"myage");
        System.out.println(newArrayList);
        newArrayList.remove(2);
        System.out.println(newArrayList);

        HashMap<Integer,String> hashMap = new HashMap<>();


        System.out.println(hashMap.get(1)); 
    }
    
}
