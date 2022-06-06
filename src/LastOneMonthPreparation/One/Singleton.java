package LastOneMonthPreparation.One;



public class Singleton {
    

    private static Singleton mySingeton=null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if( mySingeton==null){

            synchronized (Singleton.class){
                if( mySingeton==null){
                mySingeton=new Singleton();
                }
            }
    
        }
        return mySingeton;

    }
}

class myNewClass{


    public static void main(String[] args) {
       // Singleton singleton = new Singleton();
       // Singleton singletonone = new Singleton();

        // if(singleton==singletonone){
        //     System.out.println("true");
        // }
        Object a = new Object();
        Object b = new Object();

        Student employee = new Student();
        Student employeeOne = new Student();

        System.out.println(a==b);
        System.out.println(employee==employeeOne);
        System.out.println((a.equals(b)));
        System.out.println((employee.equals(employeeOne)));
    
    }
}
