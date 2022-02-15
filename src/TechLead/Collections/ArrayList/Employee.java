package TechLead.Collections.ArrayList;

public class Employee {
    private Integer empid;
    private String name;
    

    /**
     * @return Integer return the empid
     */
    public Integer getEmpid() {
        return empid;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Employee(Integer empid, String name) {
        this.empid = empid;
        this.name = name;
    }

}
