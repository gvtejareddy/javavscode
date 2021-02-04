package baeldung;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class balarraytoset {

    public static void main(String[] args) {
        
        String[] names={"teja","reddy","vinod"};

        Set<String> namesSet = new HashSet<String>(Arrays.asList(names));

    namesSet.stream().forEach((c)->{
        System.out.println(c);
    });

    String[] b = namesSet.toArray(new String[0]);

    for (String string : b) {
        System.out.println(string);
    }
    }
    
}