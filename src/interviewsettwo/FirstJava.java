package interviewsettwo;

import java.util.*;

public class FirstJava {

    public static void main ( String args[]){

        System.out.println("testing");
    }
    
}

 class onemoreclass{
    public static void main ( String args[]){

        System.out.println("testing"+onemoreclass.class);

        Random r = new Random();
        System.out.println(r.nextGaussian());
    }
}
class  Myswan{
    private String myname;
    private int one =2;
    public static void main( String args[]) {
        Myswan myswan = new Myswan();
        myswan.myname="teja";
        System.out.println(myswan.myname);
        System.out.println(myswan.one--);
        System.out.println(myswan.one);

    }
    { System.out.println("setting field"); }
    public Myswan(){
        System.out.println("constructor");
    }
}