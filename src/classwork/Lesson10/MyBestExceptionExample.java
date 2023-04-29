package classwork.Lesson10;

public class MyBestExceptionExample extends Exception {
    private int age;

    public int getAge() {
        return age;
    }

    public MyBestExceptionExample(String message, int age) {
        super(message);
        this.age = age;
    }
}
