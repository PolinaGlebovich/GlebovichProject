package homework.homework19;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread3.start();
        thread3.join();
        System.out.println("end of the third thread");
        thread2.start();
        thread2.join();
        System.out.println("end of the second thread");
        thread1.start();
        thread1.join();
        System.out.println("end of the first thread");

    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("This is my three threads");
        }
    }
