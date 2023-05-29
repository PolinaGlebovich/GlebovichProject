package classwork.lesson17;
import static java.util.Arrays.asList;
import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testStrings = asList("ABC", "abc", "f", "F", "", "a1a", "a11", "a.1", "a..1");  //совпадает ди строчка по шаблону
        //Pattern pattern = Pattern.compile("[a-z]");
        //Pattern pattern = Pattern.compile("[a-z]+"); // хотя бы одна буква
        //Pattern pattern = Pattern.compile("[a-z]*");// от нуля до бесконечности маленьких букв
        //Pattern pattern = Pattern.compile("[a-z]?"); // либо 0 букв, либо одна
        //Pattern pattern = Pattern.compile("[a-z]{2,3}");// от двух до трёха
        //Pattern pattern = Pattern.compile("[a-zA-Z]+"); // и маленькие и большие буквы
        //Pattern pattern = compile("[a-z]+", CASE_INSENSITIVE); // и маленькие и большие буквы
        //Pattern pattern = Pattern.compile("[^a-z]+"); //всё, кроме того, что написано после домика
       // Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]+"); // одна маленькая буква + одна цифра + одна маленькая буква
       // Pattern pattern = compile("[a-z]+\\d+$"); // искать в конце строки
        //Pattern pattern = compile("^[a-z]+\\d+");
        //Pattern pattern = compile("^[a-z]+\\.\\d+");  // с одной точкой
        //Pattern pattern = compile("^[a-z]+.\\d+");  // любой символ
        Pattern pattern = compile("^([a-z]+.)(\\d+)");
        testStrings.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
           // System.out.println(str + " matches?" + matcher.matches());
            if (matcher.find()) {
                System.out.println("First group: " + matcher.group(1));   // первая группа. Та, что в скобках
                System.out.println("Second group: " + matcher.group(2)); // вторая группа
            }
        });
    }
}
