package Lesson9.Bai1;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    protected enum category {
        FOOD, DRINK, CLOTHES, ELECTRONIC
    };
    private category category;

    public Product() {
    }

    public Product(String productId, String productName, double price, int quantity, Product.category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product.category getCategory() {
        return category;
    }

    public void setCategory(Product.category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}
