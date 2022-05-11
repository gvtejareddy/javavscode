package interview;

public class ContructorPartOne {

    public static void myvalue(int num){
        System.out.println("int");
    }
    
    public static void myvalue(Integer num){
        System.out.println("integer");
    }
    
    

    public static void myvalue(byte num){
        System.out.println("byte");
    }
    

    public static void myvalue(Byte num){
        System.out.println("Byte");
    }
    
    
    
    public static void main(String[] args) {
        ContructorPartOne.myvalue(27555756);

        Byte newnum=1;
        ContructorPartOne.myvalue(newnum);
        
    }
}
