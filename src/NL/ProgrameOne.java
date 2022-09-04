package NL;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProgrameOne {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(12,45,67,2,1,3,3);
           //System.out.println(getEven(numbers));
           //System.out.println(getStartingWithOne(numbers));
           System.out.println(findDuplicates(numbers));

    }

    public static List<Integer> getEven(List<Integer> numbers){
        numbers.parallelStream().filter(x->x%2==0).forEach(System.out::println);
        return numbers.parallelStream().filter(x->x%2==0).collect(Collectors.toList());
        
    }

    
    public static List<String> getStartingWithOne(List<Integer> numbers){
    numbers.stream().map(x->x+"").filter(x->x.startsWith("1")).forEach(System.out::println);
   return  numbers.stream().map(x->x+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
    }

    public static List<Integer> findDuplicates(List<Integer> numbers){
        Set<Integer> mySet = new HashSet<Integer>();
        
       // numbers.stream().filter(x->!mySet.add(x)).forEach(System.out::println);
       return   numbers.stream().filter(x->!mySet.add(x)).collect(Collectors.toList());
        }
    }
