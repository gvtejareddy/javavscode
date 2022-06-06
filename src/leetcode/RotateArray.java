package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class RotateArray {

    public static void main(String[] args) {
      
        insertArray(10,5).toString();
        ;

    }

    public  static  Deque<Integer> insertArray(int n,int k ){

        List<Integer> cArray = new ArrayList<>();

      for( int i=1;i<=n;i++){
          cArray.add(i);
      }
      Deque<Integer> deque = new ArrayDeque<>();


    for( int j=1;j<=k;j++){
        deque.addFirst(cArray.get(cArray.size()-1));
        cArray.remove(cArray.size()-1);
    }

    deque.addAll(cArray);

    System.out.println(deque.toString());
      return deque;

    }

}
