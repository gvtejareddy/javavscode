package interview.Sorting;


public class Student implements Comparable<Student> {

    private Integer score;
    private String name;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, Integer score) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return o.score-this.score;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    

}
