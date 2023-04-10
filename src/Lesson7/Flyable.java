package Lesson7;

public interface Flyable {
   // int value = 0;
    void fly();
    void flyWithSound();

    default void printMessage() {
        System.out.println("this is non informative message");
    }
}
