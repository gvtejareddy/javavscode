package interview;

class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class MethodOverriding{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
Bank sb = new SBI();

System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
System.out.println("SBI  Rate of Interest: "+sb.getRateOfInterest());  
}  
} 


//SBI Rate of Interest: 8
//ICICI Rate of Interest: 7
//AXIS Rate of Interest: 9
//SBI  Rate of Interest: 8