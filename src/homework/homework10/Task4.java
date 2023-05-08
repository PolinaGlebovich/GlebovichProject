package homework.homework10;
public class Task4 {
        public static void main(String[] args) {
            stringBuilder();
        }
        public static void stringBuilder(){
            String string = "Hello";
           char [] chars = string.toCharArray();
            StringBuilder builder = new StringBuilder();
            for(char ch: chars){
                builder.append(ch);
                builder.append(ch);
            }
            System.out.println(builder);
        }
}


