package TechLead.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableOne implements Comparable<ComparableOne> {

    private String name;
    private Integer id;

    public ComparableOne(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(ComparableOne o) {
        // TODO Auto-generated method stub

        if (this.name.compareTo(o.getName()) >1) {
            return 1;
        } else if (this.name.compareTo(o.getName()) <1) {
            return -1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "ComparableOne [id=" + id + ", name=" + name + "]";
    }

}

class MainRun {

    public static void main(String[] args) {

        ArrayList<ComparableOne> newList = new ArrayList<>();

        newList.add(new ComparableOne("Teja", 12));

        newList.add(new ComparableOne("Vinod", 10));

        newList.add(new ComparableOne("Axe", 14));
        newList.stream().forEach((x) -> System.out.println(x.toString()));
        Collections.sort(newList);

        newList.stream().forEach((x) -> System.out.println(x.toString()));
    }
}