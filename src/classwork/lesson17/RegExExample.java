package classwork.lesson17;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        String testString = "This is my 1 test string, - 12345";
        String test2 = "12345";
        Pattern numbers = Pattern.compile("\\d+");  // найти числа в строке, задание шаблона для поиска  (все цифры)
        Matcher numbersMatcher = numbers.matcher(testString);  // где мы будем искать
        System.out.println(numbersMatcher.matches()); // соответствует ли вся строка тому выражению, которое мы задали

        Matcher numberMathcers2 = numbers.matcher(test2);
        System.out.println(numberMathcers2.matches());

        //найти числа в строчке
        if(numbersMatcher.find()) {  // мы подаём команду что-то подходящее под шаблон
            System.out.println(numbersMatcher.start() + "  " + numbersMatcher.end());  // даёт нам точное
            System.out.println(numbersMatcher.group()); // возвращает этот кусок
        }

//        while (numbersMatcher.find()) {  // мы подаём команду что-то подходящее под шаблон
            System.out.println(numbersMatcher.start() + "  " + numbersMatcher.end());  // даёт нам точное
            System.out.println(numbersMatcher.group()); // возвращает этот кусок
//        }
//        numbersMatcher.reset();
//        numbersMatcher.usePattern(Pattern.compile("\\w+"));

        numbersMatcher.reset();
        numbersMatcher.results().map(MatchResult::group).map(String:: length).forEach(length -> System.out.println(length));
    }
}
