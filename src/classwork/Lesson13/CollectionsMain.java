package classwork.Lesson13;

public class CollectionsMain {
    public static void main(String[] args) {
        KeyStorage<Object> firstKey = new KeyStorage(11);
        System.out.println(firstKey);
        KeyStorage<String> secondKey = new KeyStorage<>("Abc");
        KeyStorage<Integer> thirdKey = new KeyStorage<>(111);
        System.out.println(secondKey);
        System.out.println(thirdKey);
    }
}
