package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInsideList {

    public static void main(String[] args) {

        List<List<Player>> newListofListStudent = new ArrayList<List<Player>>();

        List<Player> addPlayerList = Arrays.asList(new Player("Teja", 10), new Player("vinod", 10));

        newListofListStudent.forEach((a) -> {
            newListofListStudent.add(addPlayerList);
        });

        List<Player> listofPlayer = newListofListStudent.stream().flatMap(list -> list.stream().filter((a) -> {

            if (a.getName().contains("a") && a.getScore() > 2) {
                return false;
            } else {
                return true;
            }
        })).collect(Collectors.toList());

        listofPlayer.stream().forEach((a) -> {
            System.out.println(a.score);
        });
    }
}