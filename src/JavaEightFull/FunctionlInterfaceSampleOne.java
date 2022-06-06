package JavaEightFull;


@FunctionalInterface
public interface FunctionlInterfaceSampleOne {
    
  // public abstract void display();

   public default void m1(){
       System.out.println("M1");
   }

    static void m2(){
    System.out.println("M2");
   }

   int getSum(int x,int y);

}
