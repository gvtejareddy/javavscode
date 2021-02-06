package interview.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {
        
        List<Integer> studentScore = new ArrayList<Integer>();

        studentScore.add(60);
        studentScore.add(90);
        studentScore.add(40);
        studentScore.add(100);

        studentScore.stream().forEach((o)->{

            System.out.println(o);
        });

        Collections.sort((studentScore));

        studentScore.stream().forEach((o)->{

            System.out.println(o);
        });

        Collections.sort(studentScore, Collections.reverseOrder()); 

        studentScore.stream().forEach((o)->{

            System.out.println(o);
        });
    }
    
}
