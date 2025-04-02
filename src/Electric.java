import model.Product;

public class Electric  {
    private  long id;
    private  String brand;
    private  String colour;
    private boolean isNew;
    private int mamery;

    public Electric() {
    }

    public Electric(long id, String brand, String colour, boolean isNew, int mamery) {
        this.id = id;
        this.brand = brand;
        this.colour = colour;
        this.isNew = isNew;
        this.mamery = mamery;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMamery() {
        return mamery;
    }

    public void setMamery(int mamery) {
        this.mamery = mamery;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", isNew=" + isNew +
                ", mamery=" + mamery +
                '}';
    }
}
