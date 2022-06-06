package TechLead.ProgrammingQuestions;

public class ReverseAnInteger {

    public static void main(String[] args) {
        
        reverseModule(12345);
    }

    static void reverse( Integer num){


        StringBuilder sb = new StringBuilder();

       String newMyString = num.toString();

       for( int i=1;i<=newMyString.length();i++){

        sb=sb.append(newMyString.charAt(newMyString.length()-i));


       }


       System.out.println(sb.toString());
    }


    static void myReverse(Integer num){

        StringBuilder sb = new StringBuilder();

       String newMyString = num.toString();

       for( int i=newMyString.length()-1;i>=0;i--){

        System.out.println(newMyString.charAt(i));


       }
    }
       static void reverseModule(Integer num){
        int i =0;
        while(i<0){
           System.out.println(num%(i));
        }

       }

    
    
}
