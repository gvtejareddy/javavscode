package interview;

public class StringPool {
	
	public static void main(String [] args) {
		
		String str1 ="name";//String constant pool 
		String str3="name";
		String str2 = new String("name"); // outside pool inside heap 
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str3));
	}

}


//true
//false
//true
//true