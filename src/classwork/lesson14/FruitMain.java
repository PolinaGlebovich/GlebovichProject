package classwork.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Apple", 10, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("Peach", 25, "Yellow"));
        fruits.add(new Fruit("Banana", 25, "Yellow"));
        System.out.println(filterFruitsByColor(fruits));
        System.out.println(filterFruitsByWeight(fruits));
        System.out.println(filterFruitsByName(fruits));
        Predicate<Fruit> colorPredicate = fruit -> fruit.getColor().equals("Yellow");
        Predicate<Fruit> weightPredicate = fruit -> fruit.getWeight() > 15;
        Predicate<Fruit> namePredicate = fruit -> fruit.getName().length() > 5;

        // предикат - что-то даём, true или false
        // консьюмер - ято-то даём, ничего не возвращает
        Consumer<Fruit> myStringConsumer = s -> System.out.println(s);
        //printNeededFruits(fruits, myStringConsumer);
        Consumer<Fruit> bigFruitsConsumer = fruit -> {
            if(fruit.getWeight() > 20){
                System.out.println("we print only big fruits");
                System.out.println(fruit);
            }
        };
        Consumer<Fruit> bananaConsumer = fruit -> {
            if(fruit.getName().equals("Banana")){
                System.out.println("we print only bananas");
                System.out.println(fruit);
            }
        };
        System.out.println(filterFruits(fruits, colorPredicate));
        System.out.println(filterFruits(fruits, weightPredicate));
        System.out.println(filterFruits(fruits, namePredicate));
        System.out.println(filterFruits(fruits, fruit -> fruit.getWeight() > 20 && fruit.getColor().equals("Yellow")));
        printNeededFruits(fruits, bigFruitsConsumer);
        printNeededFruits(fruits, bananaConsumer);


    }
    private static  List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            if(predicate.test(fruit)){
                result.add(fruit);
            }
        }
        return result;
    }

    private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer){
        for (Fruit fruit: fruits){
            fruitConsumer.accept(fruit); // метод
        }
    }

    private static  List<Fruit> filterFruitsByColor(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            if(fruit.getColor().equals("Yellow")){
                result.add(fruit);
            }
        }
        return result;
    }
    private static  List<Fruit> filterFruitsByWeight(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            if(fruit.getWeight() > 15){
                result.add(fruit);
            }
        }
        return result;
    }
    private static  List<Fruit> filterFruitsByName(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            if(fruit.getName().length() > 5){
                result.add(fruit);
            }
        }
        return result;
    }
}
