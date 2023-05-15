package classwork.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Aple", 10, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("Peh", 25, "Yellow"));
        fruits.add(new Fruit("Banana", 25, "Yellow"));
        Collections.sort(fruits, ((o1, o2) -> o2.getName().length() - o1.getName().length()));
        Collections.sort(fruits, ((o1, o2) -> o2.getWeight() - o1.getWeight()));
        System.out.println(fruits);

        // ничего не принимает, но что-то возвращает
        Supplier<Integer> myBestSupplier = () -> new Random().nextInt(5);
        System.out.println(getOneFruit(fruits, myBestSupplier));
        System.out.println(getOneFruit(fruits, myBestSupplier));
        System.out.println(getOneFruit(fruits, () -> 0));
        System.out.println(getOneFruit(fruits, () -> fruits.size() - 1));
        getNotBananaSupplier(fruits);

        Function<Fruit, String> getNameFunction = fruit -> fruit.getName();
        Function<Fruit, String> getShortNameFunction = fruit -> fruit.getName().substring(0,2);
        Function<Fruit, String> getSizeFunction = fruit -> fruit.getWeight() < 10 ? "Small" : "Big";
    }
    private static List<String> convertFruits(List<Fruit> fruits, Function<Fruit, String> convert){
        List<String> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            result.add(convert.apply(fruit));
        }
        return result;
    }
    private static void getNotBananaSupplier(List<Fruit> fruits) {
        Supplier<Integer> myNotBananaSupplier = () -> {
          int position = new Random().nextInt(5);
          while (fruits.get(position).getName().equals("Banana")){
              position = new Random().nextInt(5);
          };
          return position;
        };
        System.out.println("Not bananas");
        System.out.println(getOneFruit(fruits, myNotBananaSupplier));
    }
    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> positionSupplier){
        return fruits.get(positionSupplier.get());
    }
}
