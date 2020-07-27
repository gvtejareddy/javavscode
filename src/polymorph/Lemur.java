package polymorph;

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
    return false;
    }
    public int age = 10;
    public String s1 = new String("teja");
    public String s2 = "teja";
    public StringBuilder s3 = new StringBuilder("teja");
    public StringBuilder s4 = new StringBuilder("teja");
    public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);
    System.out.println(lemur.s1.hashCode());
    System.out.println(lemur.s2.hashCode());
    System.out.println(lemur.s3.hashCode());
    System.out.println(lemur.s4.hashCode());
    System.out.println(lemur.s1.equals(lemur.s2));
    

    }
    }