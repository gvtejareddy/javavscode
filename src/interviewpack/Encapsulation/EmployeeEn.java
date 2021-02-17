package interviewpack.Encapsulation;

public class EmployeeEn {

    private String name;
    private long id;

    public EmployeeEn(String name, long id) {

        this.name = name;
        this.id = id;
    }

    public String getName() {

        return name + " " + id;
    }

    public static String newName() {
        return "newname";
    }

    protected long getId() {
        return id;
    }

}
