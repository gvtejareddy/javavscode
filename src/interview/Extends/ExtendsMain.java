package interview.Extends;

public class ExtendsMain {

    public static void main(String[] args) {

        Animal newAnimal = new Lion(20);
        Animal newAnimal1 = new Animal(20);
        Lion newlion = new Lion(30);

        System.out.println(newAnimal.getAge());

        System.out.println(newAnimal1.getAge());

        System.out.println(newlion.getAge());
        System.out.println(newlion.roar());
        
    }
    
}
