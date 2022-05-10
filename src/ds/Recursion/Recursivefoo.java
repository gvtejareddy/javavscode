package ds.Recursion;

public class Recursivefoo {

    public static void main(String[] args) {
        Recursivefoo recursivefoo = new Recursivefoo();

        recursivefoo.foo(3);
    }

    public void foo(int n) {

        if (n < 1) {
            return;
        } else {
            foo(n - 1);
            System.out.println("hello world " + n);
        }

    }
}
