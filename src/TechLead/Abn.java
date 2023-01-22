package TechLead;


public class Abn {
    public static void main(String[] args) {
        
        String myString ="bnnnaaaA";
        Integer count=0;

        for ( int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
