package interview.StaticPack;

public class StaticClass {

    public static void main(String[] args) {
        StaticVarMethod svm = new StaticVarMethod();

        StaticVarMethod.cantCreateObject(); // Can directly access the static method without creating a object

        System.out.println(StaticVarMethod.myname);

        svm.myname = "Reddy";

        System.out.println(svm.myname);
        System.out.println(StaticVarMethod.myname);

        StaticVarMethod svm1 = new StaticVarMethod();

        svm1.myname="Vinod";

        System.out.println(svm.myname);
        System.out.println(StaticVarMethod.myname);
        System.out.println(svm1.myname);

    }

}

// cant create object
// teja
// Reddy
// Reddy
// Vinod
// Vinod
// Vinod