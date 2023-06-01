package classwork.lesson19;

import java.util.concurrent.*;


public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunnable myRunnable = new MyRunnable(new Counter());
        Thread thread = new Thread(myRunnable);
        thread.start();
        new Thread(() -> System.out.println("Hello, world!")).start();

        MyCallable callable = new MyCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(10);  // сколько потоков он может задействовать
        Future<String> result = executorService.submit(callable);
        System.out.println("here");
        System.out.println("result: " + result.get());
    }
}
