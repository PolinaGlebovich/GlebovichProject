package classwork.lesson19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int count;
    private AtomicInteger intCount;
    private final Object lock = new Object();
    private volatile int counter;  // каждый раз, когда ты хочешь что-то сделать, возьми переменную со старого значения

    public int getCount() {  // может войти только один поток
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
//    public synchronized void increment() throws InterruptedException {
//        setCount(getCount() + 1);
//        System.out.println("egege");
//        Thread.sleep(1000);
//    }

        public synchronized void increment() throws InterruptedException {
        synchronized (lock){
            setCount(getCount() + 1);
        }
        intCount.incrementAndGet();
        intCount.addAndGet(10);
        intCount.decrementAndGet();
        intCount.getAndIncrement();
        setCount(getCount() + 1);
        System.out.println("egege");
        Thread.sleep(1000);
    }


}
