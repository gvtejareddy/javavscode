package TechLead.ProgrammingQuestions;

import java.util.Arrays;

public class Anargaram {
    
    public static boolean isTwin(String a, String b) {
		boolean status=true;
        int arraya[] = {1,4,5,56,0};
        Arrays.sort(arraya);
        System.out.println(arraya[arraya.length-1]);
		if(a.length() !=b.length()){
			status=false;
		}
		else{

			char[] arrayA = a.toLowerCase().toCharArray();
			char[] arrayB = b.toLowerCase().toCharArray();
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);
			status= Arrays.equals(arrayA,arrayB);
		}
        return status;
	}

    public static void main(String[] args) {
        System.out.println(isTwin("Lookout", "Outlook")); 
    }
}
