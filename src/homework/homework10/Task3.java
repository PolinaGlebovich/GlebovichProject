package homework.homework10;

import java.util.Scanner;

public class Task3 {
        public static void main(String [] args) {
            String str = "fffff ab fffffffffff  1234 jkjk";
            String [] words = str.split(" ");
            String min = words[0];
           for(int i = 0; i < words.length; i++){
               if(getNumberOfUniqueSymbols(words[i]) < getNumberOfUniqueSymbols(min)){
                   min = words[i];
               }
               if(min.length() < words[i].length()){
                   min = words[i];
               } else if (min.length() == words[i].length()) {
                   words[i] = min;

               }
           }
            System.out.println(min);
        }
        public static int getNumberOfUniqueSymbols(String word){
            int count = 0;
                for (int i = 0; i < word.length(); i++) {

                    if (!isThereSymbol(word.substring(0, i), word.charAt(i))) {
                        count++;
                    }
                }
            return count;
        }
        public static boolean isThereSymbol(String str, char ch){
            return str.contains(String.valueOf(ch));
        }
}
