package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class NearestConservtiveNumber {

    public static void main(String[] args) {

        List<Integer> newList = Arrays.asList(1, 0, 1, 1, 1, 0, 1, 0);

        Set<Integer> mySet = new HashSet<>();


        Optional<Integer> result = newList.stream().filter(obj -> !(mySet.add(obj))).findFirst();

        System.out.println(result.toString());

    }

}
