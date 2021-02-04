package interview;

public class GarbageCollector {
	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
		 GarbageCollector s1=new GarbageCollector();  
		 GarbageCollector s2=new GarbageCollector();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
}
class Finalizer {
protected void finalize() {

System.out.println("Calling finalize");
}
public static void main(String[] args) {
Finalizer f = new Finalizer();
} }

//object is garbage collected
//object is garbage collected