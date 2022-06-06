package JavaEightFull;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        Predicate<Integer> myPredicate =(x)->{
            Boolean flag=false;
            if(x>=10){
                flag= true;
            }
            else{
                flag= false;
            }
            return flag;
        };
    List<Integer> myList = Arrays.asList(10,20,30,-1);

    System.out.println(myPredicate.test(20));

    myList.stream().filter(myPredicate).forEach(x-> System.out.println(x));
    }
    
}
