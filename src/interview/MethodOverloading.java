package interview;

public class MethodOverloading {
	    
	  void sum(int a,int b){System.out.println(a*b);}  
	  void sum(int a,long b){System.out.println(a+b);}
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[]){  
		  MethodOverloading obj=new MethodOverloading();  
	  obj.sum(20,20);//now second int literal will be promoted to long  

	  obj.sum(10,999999999);
	  obj.sum(20,20,20);  

	  System.out.println(Integer.MAX_VALUE);
	  System.out.println(Long.MAX_VALUE);

}
}
