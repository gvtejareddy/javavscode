package TechLead.ProgrammingQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordUsingHashMap {
    

public static void main(String[] args) {
    
    Map<String,Integer> myHashmap = new HashMap<String,Integer>();

    String myString ="My Name is Teja Reddy My Name Teja";


    String myStringArray[] = myString.split(" ");

for (String string : myStringArray) {
    if(myHashmap.containsKey(string)){
        Integer count=myHashmap.get(string);
        myHashmap.put(string, count+1);
    }
    else{
        myHashmap.put(string, 1);
    }

   
}


System.out.println(myHashmap.toString());
    
}

}
