package homework.homework13;

import java.util.*;
public class Task3 {
    public static void main(String[] args) {


        Map<String, List<String>> myMap = getStringListMap();
        distributeToCategories(myMap);
        System.out.println(myMap);
    }
    private static Map<String, List<String>> getStringListMap() {
        Map<String, List<String>> myMap = new HashMap<>();

        List<String> berries = new ArrayList<>();
        myMap.put("berries", berries);

        List<String> fruits = new ArrayList<>();
        myMap.put("fruits", fruits);

        List<String> vegetables = new ArrayList<>();
        myMap.put("vegetables", vegetables);
        return myMap;
    }
    private static void distributeToCategories(Map<String, List<String>> myMap) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <= 10; i++) {
            System.out.println("Choose category: ");
            String category = scanner.nextLine();
            if (myMap.get(category) == null) {
                System.out.println("This is not a category");   // если нет такокй категории
            } else {
                System.out.println("Choose subject: ");
                String subject = scanner.nextLine();
                myMap.get(category).add(subject);
            }
        }
    }
}
