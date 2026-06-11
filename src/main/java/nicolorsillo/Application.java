package nicolorsillo;

import com.github.javafaker.Faker;
import nicolorsillo.entities.Order;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Supplier<List<Order>> randomOrderSupplier = () -> {
            ArrayList<Order> order = new ArrayList<>();

            Random random = new Random();

            Faker faker = new Faker(Locale.ITALIAN);

            for (int i = 0; i < 100; i++) {
                order.add(new Order(faker.commerce().productName(), faker.commerce().department(), faker.number().randomDouble(2,5,100) , faker.name().firstName()));
            }
            return order;
        };

        List<Order> randomOrder = randomOrderSupplier.get();

       /* System.out.println("\n------- Esercizio 1 --------\n");


        Map<String, List<Order>> orderByUsers = randomOrder.stream().collect(Collectors.groupingBy(Order::getUser));
        orderByUsers.forEach((user, order) -> System.out.println("User:" + user + ",Orders:" + order));

        System.out.println("\n------- Esercizio 2 --------\n");

        orderByUsers.forEach((user, ordersList) -> {
            double total = ordersList.stream()
                    .mapToDouble(Order::getProductPrice)
                    .sum();
            System.out.println("User: " + user + ", Orders total: " + total + "€");
        });

        System.out.println("\n------- Esercizio 3 --------\n");

        Set<Order> products = randomOrder.stream().collect(Collectors.toSet());
        System.out.println(
        products.stream().collect(Collectors.summarizingDouble(Order::getProductPrice))); */

        System.out.println("\n------- Esercizio 5 --------\n");

        Map<String, List<Order>> orderByCategory = randomOrder.stream().collect(Collectors.groupingBy(Order::getProductCategory));
        orderByCategory.forEach((productCategory, ordersList) -> {
            double total = ordersList.stream()
                    .mapToDouble(Order::getProductPrice)
                    .sum();
            System.out.println("Category: " + productCategory + ", Orders total: " + total + "€");
        });
















    }
}
