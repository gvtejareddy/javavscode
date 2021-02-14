package interview.fuctionalInterface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFunctionalInterface pf = ()->{System.out.println("print");};
		pf.printFunction();
		
		Predicate<Boolean> newPredicate = (a)-> {return a;};
		
		System.out.println(newPredicate.test(true));



	}
	

}
