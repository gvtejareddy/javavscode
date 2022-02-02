package ds.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
     
        System.out.println(fib(5));
        
    }

    public static int fib(int n){

        if(n <1){
            return 0;
        }
        else if( n==2 || n==1){
            return n-1;
        }
        else{

            return fib(n-1)+fib(n-2);  // f(3) + f(2)  -> f(2)+ f(1)  -> 1 + 1 =2;
         }                             //  f(4) + f(3) -> (f(3) + f(2))+f(2)  -> (f2+f(1))+1 +1 -> 1+1+1           

    }
    
}
//0,1,1,2,3,5