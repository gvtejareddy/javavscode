package TechLead.ProgrammingQuestions;

public class ReverseString {

    public static void main(String[] args) {
        
        System.out.println(getReverseOfString("Automation"));
    }

    public static String getReverseOfString(String myStr){

        StringBuilder sb = new StringBuilder();

        System.out.println(myStr.length());
        System.out.println(myStr.charAt(0));
        for(int i=1;i<=myStr.length();i++){
            sb.append(myStr.charAt(myStr.length()-i));
        }
        return sb.toString();
    }
    
}
