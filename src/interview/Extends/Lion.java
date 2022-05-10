package interview.Extends;

public class Lion extends Animal {

    Lion(Integer age) {
        super(age);
    }

    public Integer roar() {

        setAge(20);

        return getAge();

    }

    public Integer getAge(){
      return super.getAge()+2;  
    }
}
