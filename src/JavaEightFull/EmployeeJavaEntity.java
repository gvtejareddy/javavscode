package JavaEightFull;

public class EmployeeJavaEntity implements Comparable<EmployeeJavaEntity>{

    private Integer id;
    private String firstName;
    private String lastName;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public EmployeeJavaEntity(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public int compareTo(EmployeeJavaEntity o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
