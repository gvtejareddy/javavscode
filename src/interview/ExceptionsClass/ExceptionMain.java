package interview.ExceptionsClass;

import java.util.Random;

public class ExceptionMain {

    public static void main(String[] args) {

        Random ar = new Random();
        int number = ar.nextInt(10);

        try {

            if (number % 2 == 0) {
                throw new MoreThanFixeException("Value is divisble by 2");
            } else {
                throw new NotDivByTwo("Value is not divisble by 2");
            }
        } catch (MoreThanFixeException e) {
            System.out.println(e);
        } catch (NotDivByTwo e) {
            System.out.println(e);
        } finally {
            System.out.println(number);
        }

    }

}
