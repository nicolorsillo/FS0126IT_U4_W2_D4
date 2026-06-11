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

        System.out.println("-------Esercizio 1--------");


        Map<String, List<Order>> orderByUsers = randomOrder.stream().collect(Collectors.groupingBy(order -> order.getUser()));
        orderByUsers.forEach((user, order) -> System.out.println("User:" + user + ",Orders:" + order));
    }
}
