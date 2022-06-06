package JavaEightFull;


public class Books {

    private int id ; 
    private String name;
    private int pages;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Books(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Books [id=" + id + ", name=" + name + ", pages=" + pages + "]";
    }


    
}
