package shipment;

import java.io.FileNotFoundException;

public class hackerrank {

    long repeatedString(String s, long n) {

    String[] strArray= s.split("");

    System.out.println(strArray.toString());

    
        for(int j=0 ;j<n;j++){
            for(int i=0; i<s.length();i++){
                
        }
    }

        long counter = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scan = new Scanner(new
        // File("D:/Learning/javavscode/javavs/src/shipment/note.txt"));
        // Double d =0.00; String s="" ;String z="" ; Integer i=0;
        // while (scan.hasNext()) {
        // z= scan.nextLine();
        // if ((Double.parseDouble(z) % 1 == 0)) {
        // d= Double.parseDouble(z);
        // }
        // else if (Integer.parseInt(z) > 0) {
        // i = Integer.parseInt(z);
        // } else {
        // s= z;
        // }
        // }
        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);

        // String myName[] = new String[0];

        // try {
        // System.out.println(myName[0]);
        // } catch (Exception e) {
        // //TODO: handle exception
        // System.out.println(e);
        // }

        hackerrank hr = new hackerrank();
        hr.repeatedString("abc", 10);
    }

}