package TechLead.ProgrammingQuestions;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class PlaindromeJava {
    

    public static void main(String[] args) {
    

        System.out.println(isPalinDrome("1512"));
    }

    public static Boolean isPalinDrome(String string){

            boolean flag =true; //ababa

            Integer length = string.length()/2;

            System.out.println(length);

        for(int i=0;i<length;i++){
                if( string.charAt(i)==string.charAt(string.length()-(i+1)) && flag){

                }else{
                    flag=false;
                    break;
                }

        }
        return flag;
    }
}
