package classwork.lesson12;

import java.io.*;

public class CarReaderExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("car.dc");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            while (true) {
                Car myCar = (Car) objectInputStream.readObject();
                System.out.println(myCar);
            }
        } catch (FileNotFoundException e) {
          //  throw new RuntimeException(e);
        } catch (IOException e) {
           // throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
