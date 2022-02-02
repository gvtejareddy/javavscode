package interviewsettwo;

public class StringsJava {
    
    public String myname= "teja";
    public String mynametwo= new String ("teja");
    public StringBuilder mynamethree = new StringBuilder("teja");
    public static void main(String[] args) {
        
        StringsJava stringsJava = new StringsJava();

        if(stringsJava.myname==stringsJava.mynametwo){
            System.out.println("String and new String"+true);
        }
        if(stringsJava.myname.equals(stringsJava.mynametwo)){
            System.out.println("string content is same");
        }
        
        System.out.println(stringsJava.myname==stringsJava.mynametwo);

    }{

    }
}
