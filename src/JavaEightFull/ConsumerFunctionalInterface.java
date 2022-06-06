package JavaEightFull;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface  {



public static void main(String[] args) {
    
Consumer<Integer> consumer = (x)->{
System.out.println(x);
};

consumer.accept(10);

}
    
}
