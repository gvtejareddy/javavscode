package TechLead.ProgrammingQuestions;

public class SwapTwoNumbers{

public static void main(String[] args) {
    
    int x = 10 ;
    int y = 20 ;
    int temp;
    temp=x;
    x=y;
    y=temp;

    System.out.println(x +" "+y);


    int i = 10 ; 
    int j = 20;

    j= i+j; //30
    i=j-i;
    j=j-i;

    System.out.println(i +" "+j);

}


}