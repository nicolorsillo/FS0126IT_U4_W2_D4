package nicolorsillo.entities;

public class Order {
    private String productName;
    private String productCategory;
    private double productPrice;
    private String User;

    public Order(String productName, String productCategory, double productPrice, String User) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.User = User;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getUser() {
        return User;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
