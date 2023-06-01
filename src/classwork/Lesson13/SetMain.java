package classwork.Lesson13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>(); // можно быстро найти
        Set<String> secondSet = new TreeSet<>(); // по порядку
        firstSet.add("afirst");
        firstSet.add("bsecond");
        firstSet.add("cthird");
        System.out.println(firstSet.add("cthird"));
        secondSet.add("afirst");
        secondSet.add("bsecond");
        secondSet.add("cthird");
        secondSet.add("cthird");
        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(firstSet.contains("first"));
        System.out.println(firstSet.isEmpty());
        System.out.println(firstSet.size());
        System.out.println(firstSet.remove("cthird"));
        System.out.println(firstSet.remove("hird"));

        Set<Person> myPersonSet = new TreeSet<>();
        myPersonSet.add(new Person("Polina", "Glebovich"));
        myPersonSet.add(new Person("Dima", "Glebovich"));
        myPersonSet.add(new Person("Polina", "Grebovich"));
        System.out.println(myPersonSet);
    }
}
