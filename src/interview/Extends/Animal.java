package interview.Extends;

public class Animal {

    private Integer age;

    Animal(Integer age) {
        this.age = age;
    }

   

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        System.out.println("ANIMAL AGE");

        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

}