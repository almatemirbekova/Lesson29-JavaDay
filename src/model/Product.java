package model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String discrition;
    private int price;
    private LocalDate creatdayt;
    private String type;
    private int productCount;

    public Product() {
    }

    public Product(int id, String name, String discrition, int price, LocalDate creatdayt, String type, int productCount) {
        this.id = id;
        this.name = name;
        this.discrition = discrition;
        this.price = price;
        this.creatdayt = creatdayt;
        this.type = type;
        this.productCount = productCount;
    }

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

    public String getDiscrition() {
        return discrition;
    }

    public void setDiscrition(String discrition) {
        this.discrition = discrition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreatdayt() {
        return creatdayt;
    }

    public void setCreatdayt(LocalDate creatdayt) {
        this.creatdayt = creatdayt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "model.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discrition='" + discrition + '\'' +
                ", price=" + price +
                ", creatdayt=" + creatdayt +
                ", type='" + type + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
