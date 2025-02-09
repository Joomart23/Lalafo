package aa;

public class Announement {
    private Long id;
    private String name ;
    private String description;
    private int price;
    private String owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "aa.Announementservis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Announement(Long id, String name, String description, int price, String owner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.owner = owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
