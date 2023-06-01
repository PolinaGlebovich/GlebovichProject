package classwork.Lesson13;
import java.util.*;
public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>();
        Map<Integer, String> secondMap = new TreeMap<>();
        firstMap.put(1, "Red");              // 1 - это ключ, слово - это значение
        firstMap.put(2, "Orange");
        firstMap.put(3, "Yellow");
        firstMap.put(1, "next");
        System.out.println(firstMap.get(1));
        System.out.println(firstMap.get(4));
        secondMap.put(1, "Red");
        secondMap.put(2, "Orange");
        secondMap.put(3, "Yellow");
        System.out.println(firstMap.containsKey(3));
        System.out.println(firstMap.isEmpty());
        System.out.println(firstMap.size()); // сколько ключей есть в Map
       // System.out.println(firstMap.remove(3));
        System.out.println(firstMap.keySet()); // все ключи, которые есть
        System.out.println(firstMap.values());
        System.out.println(firstMap);
        for (Integer key: firstMap.keySet()){
            System.out.println(firstMap);
        }
        firstMap.forEach((k, v) -> System.out.println(k + " " + v));  // k - key v - value

        List<Integer> integers;
        List<List<Integer>> integers2;
        Map<String, List<String>> myMap = new HashMap<>();
        // computers (Lenovo, Asus)
        // phones (Samsung, Iphone)

        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");

        List<String> phones = new ArrayList<>();
        phones.add("Samsung");
        myMap.put("computers", computers);
        myMap.put("phones", phones);
        myMap.get("phones").add("iphone");

    }
}
