
package Overseas;

public class CallStatic {
    static Integer counter = 0;
    Integer myInt = 0;

    public static void runMethod() {

        counter++;

        System.out.println("run " + counter);
    }

    public Integer runSum() {

        myInt = myInt + 1;
        return myInt++;
    }

    public static void main(String[] args) {

        runMethod();
        CallStatic.runMethod();
        CallStatic cs = new CallStatic();
        CallStatic csone = new CallStatic();
        cs.runMethod();
        System.out.println(cs.runSum());

        System.out.println(csone.runSum());

    }

}
