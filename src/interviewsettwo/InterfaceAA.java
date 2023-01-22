package interviewsettwo;

public interface InterfaceAA {
    public  void display();
    public static String displayString(){
        return "";
    }
    public  default String displayStringFinal(){
        return "";
    }
    
}
