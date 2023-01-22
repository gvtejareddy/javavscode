package JavaEightFull;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

public class StoneWall {
    public  int solution(String[] input) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int index = 0;
        for(String s : input) {
            List<Integer> list = new ArrayList<>();

            for (int i =0; i < s.length(); i ++) {
                int k = Integer.parseInt(String.valueOf(s.charAt(i)));
                    list.add(k);
            }
            map.put(index, list);
            ++index;
        }

        Map<Integer, Long> counts = new HashMap<>();
       for(List<Integer> inputEntry : map.values()) {
           for(Integer n: inputEntry) {
               Long c = counts.get(n);
               if (c == null) {
                   c =0L;
               }
               counts.put(n, c+1);
           }
       }
        Iterator<Long> it = counts.values().iterator();
       while (it.hasNext()) {
           Long c = it.next();
           if (c == 1L) {
               it.remove();
           }
       }
       //int mCount = 0;
       Map<String, Integer> map1 = new HashMap<>();
       Set<Integer> set = counts.keySet();
       for (String s: input) {
           for (int a : set) {
               if (s.contains(a+"")) {
                   map1.put(s, a);
               }
           }
       }
        return (int) map1.entrySet().stream().count();
    }
    public static void main(String[] args) {
        StoneWall st = new StoneWall();
        String h[] = {"039", "4", "14", "32", "", "34", "7"};
        System.out.println(st.solutionone(h));
        
    }

    public  int solutionone(String[] E) {
        Map<String, String> daysPerEmployee = new HashMap<>();
        for (int employerIndex = 0; employerIndex < E.length; employerIndex++) {
            String employer = String.valueOf(employerIndex);
            String employerAvailableDays = E[employerIndex];
            daysPerEmployee.put(employer, employerAvailableDays);
        }

        Map<Integer, Set<String>> employeesAvailablePerDay = new HashMap<>();
        for (int dayIndex = 0; dayIndex < 10; dayIndex++) {
            String day = String.valueOf(dayIndex);
            Set<String> employers = daysPerEmployee
                    .entrySet().stream()
                    .filter(e -> e.getValue().contains(day)) // find all employees that are available on dayIndex
                    .map(Map.Entry::getKey) // map entries to employee index
                    .collect(Collectors.toSet());
    
            employeesAvailablePerDay.put(dayIndex, employers);
        }
        Set<String> maximumAvailableEmployees = new HashSet<>();
    for (int dayOne = 0; dayOne < employeesAvailablePerDay.keySet().size(); dayOne++) {
        Set<String> dayOneAvailableEmployees = employeesAvailablePerDay.get(dayOne);
        for (int dayTwo = dayOne + 1; dayTwo < employeesAvailablePerDay.keySet().size(); dayTwo++) {
            Set<String> dayTwoAvailableEmployees = employeesAvailablePerDay.get(dayTwo);

            Set<String> employees = new HashSet<>();
            employees.addAll(dayOneAvailableEmployees);
            employees.addAll(dayTwoAvailableEmployees);

            if (employees.size() > maximumAvailableEmployees.size()) {
                maximumAvailableEmployees = employees;
            }
        }
    }

    return maximumAvailableEmployees.size();
    }



    }
  