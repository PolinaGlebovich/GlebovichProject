package classwork.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderExample {
    public static void main(String[] args) {

        List<Order> orders = getOrders();
        var result = orders.stream()
                .filter(isOrderWithEggs()).toList();

        System.out.println(result);

        var products = orders.stream()
                .flatMap(getProductStream())
                .distinct()
                .map(Product::getProductName)
                .toList();
        System.out.println(products);
    }

    private static Function<Order, Stream<? extends Product>> getProductStream() {
        return order -> order
                .getProducts()
                .stream();
    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order.getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product.getProductName().equals("Eggs");
    }

    private static List<Order> getOrders() {

        List<Product> products = getFirstProductsList();

        List<Product> secondProducts = getSecondProductsList();

        List<Product> thirdProducts = getThirdProductsList();

        return Arrays.asList((new Order(1, products)),
                new Order(2, secondProducts),
                new Order(3, thirdProducts));
    }

    private static List<Product> getThirdProductsList() {
        return Arrays.asList(
                new Product("Juice", 45),
                new Product("Pie", 15),
                new Product("Roll", 12));
    }

    private static List<Product> getSecondProductsList() {
        return getSecondProducts();
    }

    private static List<Product> getSecondProducts() {
        return Arrays.asList(
                new Product("Bread", 5),
                new Product("Apple", 15),
                new Product("Orange", 4));
    }

    private static List<Product> getFirstProductsList() {
        return Arrays.asList(
                new Product("Milk", 20),
                new Product("Eggs", 15),
                new Product("Sugar", 10));
    }
}


