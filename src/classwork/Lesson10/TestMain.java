package classwork.Lesson10;

public class TestMain {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "This is my string";
        String str3 = new String("This is my string");
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str2));
        System.out.println(str.compareTo(str2));

        String addString = str + str2;
        System.out.println(addString);
        System.out.println(str.concat(str2));
        String [] arr = new String[]{str, str2, str3};
        System.out.println(str.join(" ", arr));

        String myBestString = "      This is string              ";
        System.out.println(myBestString.length());
        myBestString = myBestString.trim();
        System.out.println(myBestString);
        System.out.println(myBestString.length());
        System.out.println(myBestString.charAt(5));
        for(int i = 0; i < myBestString.length(); i++){
            System.out.println(myBestString.charAt(i));   // так не делать!!!!!



        }

        char[] charArr = myBestString.toCharArray();  // массив символов. Выводит каждый по отдельности
        int count = 0;
        for(char ch: charArr) {
            // символы или число или 'i'
            if (ch == 'i'){
                count++;
            }
        }
        System.out.println("Count: " + count);
        System.out.println(myBestString.substring(4));
        System.out.println(myBestString.substring(5,8));
    }
}
