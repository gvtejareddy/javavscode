package app;

import java.util.HashMap;
import java.util.Map;

public class App {

    
// largest and smallest unique character word
// dont consider a letter word
public static void main(String[] args) {

    String name="hello i am tejar i am a fullstack engineer i do frontend development i can do backend also";
    String myArray[] = name.split(" ");

    Map<String,Integer> myMap = new HashMap<String,Integer>();
// hello helo ,  i am 
    for (String string : myArray) {
        
        String newString = string ;

        if(string.length()>1){ // if char more than 1
            for( int i=0;i<string.length();i++){
               
            for( int j = i+1 ;j<string.length();j++){
                int count =0;
                myMap.put(string, count);
                if(string.charAt(i)==string.charAt(j)){
                    //System.out.println(string.charAt(j));
                    count++;
                    myMap.put(string, count);
                }
             // count of ;largest 

            }

        }        
        }

    }

    System.out.println(myMap.toString());

}


}