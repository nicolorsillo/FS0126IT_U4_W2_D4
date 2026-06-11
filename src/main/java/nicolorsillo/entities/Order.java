package nicolorsillo.entities;

import java.util.List;

public class Order {

    // Attributs

    private String productName;
    private String productCategory;
    private double productPrice;
    private String User;

    //Methods

    public static double calculateTotalPrice(List<Order> order) {
        double totalPrice = 0;
        for (Order orderItem : order) {
            totalPrice += orderItem.getProductPrice();
        }
        return totalPrice;
    }



    //Constructor

    public Order(String productName, String productCategory, double productPrice, String User) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.User = User;
    }

    //Getter

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
