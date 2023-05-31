package classwork.lesson19;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        String name = Thread.currentThread().getName(); // имя текушего потока
        System.out.println("thread name:" + name);
        Thread.currentThread().setName("My super name");  // изменение имени
        System.out.println(Thread.currentThread().getName());
        System.out.println("is live " + Thread.currentThread().isAlive());
        System.out.println("is live " + Thread.currentThread().isInterrupted());  // завершился или работает
        try {
            Thread.sleep(5000); // приостановление работы
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world2");
    }
}
