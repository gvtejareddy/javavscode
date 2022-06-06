package JavaEightFull;

public class FunctionalInterfaceSampleOneImpl {
    

  public static void main(String[] args) {
      FunctionlInterfaceSampleOne functionlInterfaceSampleOne =(x , y)-> {return x+y;};
    
      System.out.println(functionlInterfaceSampleOne.getSum(1,2)); 
      functionlInterfaceSampleOne.m1();
      FunctionlInterfaceSampleOne.m2();

  }

}
