package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListInsideList {

    public static void main(String[] args) {

        List<List<Player>> newListofListStudent = new ArrayList<List<Player>>();

        List<Player> addPlayerList = Arrays.asList(new Player("Teja", 10),new Player("vinod",10));

        newListofListStudent.forEach((a) -> {
            newListofListStudent.add(addPlayerList);
        });

       System.out.println(newListofListStudent.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}