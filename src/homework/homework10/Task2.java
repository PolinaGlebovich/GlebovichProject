package homework.homework10;
//Дана строка произвольной длины с произвольными словами. Найти самое короткое слово в строке и вывести его на экран.
// Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
public class Task2 {
    public static void main(String[] args) {
        String str = "Java programming is the best thing in the world!";
        String [] words = str.split(" ");
        String str1 = words[0];
        String str2 = words[0];



        for(String word: words) {
            if (word.length() >= str1.length()) {
                str1 = word;
            }
            if(word.length() <= str2.length()){
                str2 = word;
            }
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}
