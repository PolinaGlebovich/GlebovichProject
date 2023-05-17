package classwork.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 10, 50, 3);
        List<Integer> val2 = List.of(1, 2, 3); // нельзя менять
        List<Integer> emptyList = Collections.emptyList();  // подходит для тестов
        List<Integer> singleElement = Collections.singletonList(1); // лист с одним значением, тоже подходит для тестов
        Stream<List<Integer>> listStream = Stream.of(values, values, val2);

        Stream<Integer> valueStream = values.stream();  // создание потока
        Stream<String> stream = Stream.of("A", "b", "c");  // заполнение

        Stream<String> myRows = Files.lines(Paths.get("file.txt"));  // читает с файла
        Stream<Integer> firstString = Stream.iterate(0, n -> n + 1);
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(100));

//        List<Integer> result = firstString
//                .skip(20)  // ыкинет первые два значения
//                .limit(30)
//                .distinct()   // убирает одинаковые значение
//                .peek(x -> System.out.println(x))  // для тестов
//                .sorted(getIntegerComparator())
//                .filter(val -> val % 2 == 0)
//                .map(x -> x * x)
//                .filter(StreamMain::isOdd)
//                .collect(Collectors.toList());

        firstString
                .skip(20)  // ыкинет первые два значения
                .limit(30)
                .distinct()   // убирает одинаковые значение
                //.peek(x -> System.out.println(x))  // для тестов
                .sorted(getIntegerComparator())
                .filter(val -> val % 2 == 0)
                .map(x -> x * x)
                .filter(StreamMain::isOdd)
                .map(x -> (long)x)
                //.forEachOrdered(x -> System.out.println(x));
                        .reduce((a, b) -> a * b).ifPresent(x -> System.out.println(x));



        //  Set<Integer> resultSet = valueStream.collect(Collectors.toSet());
       // System.out.println(result);

        System.out.println(listStream.flatMap(Collection::stream)
                        .filter(x -> x < 3)
                        .noneMatch(x -> x % 3 == 0));  // проверяет, точно ли нет ни одного x с таким условием
                        //.allMatch(x -> x > 1));
                       // .findAny().orElseThrow());
                       // .findFirst().orElseThrow());  // находит первое число
                       // .max((o1, o2) -> o1.compareTo(o2)).orElseThrow());  // найти max

         //       .count());
        // .collect(Collectors.toSet());
        //.toList(); // соединяет листы в один большой
        //System.out.println("second: " + secondResult);


    }

    private static Comparator<Integer> getIntegerComparator() {
        return (o1, o2) -> o2.compareTo(o1);
    }

    private static boolean isOdd(Integer x) {
        return x < 1000;
    }
}
