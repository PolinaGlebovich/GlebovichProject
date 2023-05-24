package homework.homework14;

import java.util.function.Function;
public class Task5 {
    public static void main(String[] args) {

        Function<String, Integer> countVowelsLetter = (str) -> {
            int count = 0;
            String vowels = "a e i o u";
            String [] arrVowels = vowels.split(" ");
            for(String vow: arrVowels){
                if(str.contains(vow)){
                    count++;
                }
            }
            return count;
        };
        System.out.println(countVowelsLetter.apply("eripwkffgaeee"));
    }
}
