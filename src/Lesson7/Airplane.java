package Lesson7;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Airplane is flying, zhhzhzzh");
    }
}
