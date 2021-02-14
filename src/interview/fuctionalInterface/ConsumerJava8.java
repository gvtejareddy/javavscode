package interview.fuctionalInterface;

import java.util.function.Consumer;

public class ConsumerJava8 {

    public static void main(String[] args) {

        Consumer<String> consumer = (a) -> System.err.println("a"); /// takes input and doesnt retunr anything

        consumer.accept("a");
    }

}
