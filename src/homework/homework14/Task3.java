package homework.homework14;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {

        Predicate<Integer> isNumberDivide = x -> x % 13 == 0;
        System.out.println(isNumberDivide.test(22));


        LocalDate currentDate = LocalDate.now();
        Supplier<Integer> printCountOfDaysToWeekend = () -> 6 - currentDate.getDayOfWeek().getValue();
        System.out.println(printCountOfDaysToWeekend.get());


        Consumer<Integer> printSquareOfNum = x -> {
            if(x >= 0) {
                System.out.println(x * x);
            } else {
                System.out.println("It's negative number");
            }
        };
         printSquareOfNum.accept(3);

        Function<String, Integer> getCountOfWords = x-> {
            String[] str = x.split(" ");
            return str.length;
        };
        System.out.println(getCountOfWords.apply("В траве сидел кузнечик"));
    }
}
