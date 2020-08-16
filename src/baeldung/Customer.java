package baeldung;

public class Customer {

    private Integer id;
    private String name;
    private String place;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Customer(Integer id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", place=" + place + "]";
    }

}
