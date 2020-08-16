package baeldung;

import java.util.HashSet;
import java.util.Set;

public class balhashset {
    

    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();



        hashset.add("a");
        hashset.add("b");
        hashset.add("a");

hashset.stream().forEach((c)->{
    
    System.out.println(c);
});
    }
}