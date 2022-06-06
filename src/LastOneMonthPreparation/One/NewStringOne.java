package LastOneMonthPreparation.One;

public class NewStringOne {
    
    public static void main(String[] args) {
        String myString= "teja";
        String newString ="teja";
        String myName = new String("teja");
        StringBuilder myNameBuilder = new StringBuilder("teja");

        System.out.println("String");


        System.out.println(myString==newString);
        System.out.println(myString.equals(newString));

        System.out.println("new String");

        
        System.out.println(myName==newString);
        System.out.println(myName.equals(newString));

        System.out.println(" String builder");

        System.out.println(myNameBuilder);
         
      //  System.out.println(myNameBuilder==newString);
        System.out.println(myNameBuilder.equals(newString));
    }
}
