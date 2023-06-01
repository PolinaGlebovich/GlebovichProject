package classwork.lesson19;

import java.util.Random;

public class MyThread extends Thread {
    private int count;

    public int getCount() {
        return count;
    }

    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Start of my thread with name " + getName());
        count = new Random().nextInt();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        System.out.println("End of my thread with name " + getName());
    }
}
