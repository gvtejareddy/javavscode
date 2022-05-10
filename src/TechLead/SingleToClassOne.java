package TechLead;



public class SingleToClassOne {

    private static SingleToClassOne mySingleTon=null;


    public static SingleToClassOne getInstance(){

        if(mySingleTon ==null){
            mySingleTon=new SingleToClassOne();
        }
        return mySingleTon;
    }
    
}

class RunSingleTon{

    public static void main(String[] args) {
        
        SingleToClassOne singleToClassOne1 = SingleToClassOne.getInstance();
        SingleToClassOne singleToClassOne2 = SingleToClassOne.getInstance();
        SingleToClassOne singleToClassOne3 = SingleToClassOne.getInstance();

        if( singleToClassOne1 ==singleToClassOne2){
            System.out.println(singleToClassOne1.getClass().hashCode());
            System.out.println(singleToClassOne2.getClass().hashCode());
        }

    }
}