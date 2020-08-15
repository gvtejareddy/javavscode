package baeldung;

import java.util.LinkedList;
import java.util.List;

public class ballinkedlist {
    public static void main(String[] args) {
        
        List<String> linkedList = new LinkedList<String>();

        linkedList.add("teja");

        linkedList.stream().forEach((c)->System.out.println(c));
    }
    
}