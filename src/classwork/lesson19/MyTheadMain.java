package classwork.lesson19;

import java.time.LocalDateTime;

public class MyTheadMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalDateTime.now());
        MyThread thread1 = new MyThread("first");
        MyThread thread2 = new MyThread("second");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("State: " + thread1.getState());
        MyThread thread3 = new MyThread("third");
        thread3.setDaemon(true);  // поток, который программа не ждёт до конца
        thread1.start();
        System.out.println(thread1.isAlive());
        thread2.start();
        thread1.join();  // программа должна дождаться, пока поток 1 закончит работу
        System.out.println(thread1.isAlive());
       // thread3.start();
       // thread3.interrupt();  // прерывание потока
//        new Thread(() -> {
//            while (true){
//                System.out.println("hello world spam");
//            }
//        }).start();
        System.out.println("End: " + LocalDateTime.now());
        System.out.println(thread1.getCount());
    }
}
