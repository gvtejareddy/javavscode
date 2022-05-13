package Overseas;

public class CastingJava {
    

    public static void main(String[] args) {
        String myNum="12";

        Integer myinteger = Integer.valueOf(myNum);
     
        System.out.println(myinteger);
        double mydouble = 9;

        Integer mydouint = (int) mydouble;
        System.out.println(mydouble);
        System.out.println(mydouint);

    }
    
}

