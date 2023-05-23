package classwork.lesson16;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.getOrDefault("a", "not found");
        testMap.putIfAbsent("a", "abc");
       // testMap.computeIfAbsent("aa", (o1, o2) -> o1 + o2);


        List<User> users = Arrays.asList(new User(20, "Nick"),
                new User(30, "Mike"),
                new User(20, "Ada"),
                new User(30, "Violetta"));

                Map<Integer, List<User>> userByAge = users.stream()
                        .collect(Collectors
                                .groupingBy(user -> user.getAge()));
        System.out.println(userByAge);

        var employee = Arrays.asList(new Employee("worker", 200),
                new Employee("worker", 250),
                new Employee("Manager", 1200),
                new Employee("worker", 200),
                new Employee("Manager", 3200),
                new Employee("worker", 200),
                new Employee("worker", 200));

        var averageSalary = employee.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(averageSalary);

        var employeesByCategory = employee.stream()
                .collect(Collectors
                        .groupingBy(Employee::getCategory));
        System.out.println(employeesByCategory);

        var salariesByCategory = employee.stream()
                .collect(Collectors
                        .groupingBy(Employee::getCategory,
                                Collectors.averagingDouble(Employee :: getSalary)));
        System.out.println(salariesByCategory);


        var minSalariesByCategory = employee.stream()
                .collect(Collectors
                        .groupingBy(Employee::getCategory,
                                Collectors.minBy(Comparator.comparingDouble(Employee:: getSalary))));
        System.out.println(minSalariesByCategory);

        Map<Employee, String> tests = employee.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        Employee::getCategory));
        System.out.println(tests);


    }
}
