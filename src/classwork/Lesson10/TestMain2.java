package classwork.Lesson10;

import java.util.Arrays;

public class TestMain2 {
    public static void main(String[] args) {
        String str = "This is string";
        String str2 = "This Is string";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.replace('i','a'));
        System.out.println(str.contains("is"));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("is",8));
        System.out.println(str.lastIndexOf("is"));
//        System.out.println(str.replaceFirst("", "a"));
//        System.out.println(str.replaceAll("", "a"));

        StringBuilder builder = new StringBuilder();

        String str4 = "abra";
        int myVal = 125;
        String result = String.valueOf(myVal);
        String result2 = 125 + "";
        System.out.println(result);
        System.out.println(result2);
        System.out.println(str4 + 2);
        System.out.println(str4);
        System.out.println(str4.startsWith("ab"));
        System.out.println(str4.endsWith("ab"));
        String[] myArr = str.split(" ");
        System.out.println(Arrays.toString(myArr));
        System.out.println(str.isEmpty());
        System.out.println(str);
        String str6 = null;
    }
}
