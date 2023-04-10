package Homework4;
//Создайте массив из n случайных целых чисел и выведите его на экран.
// Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
// Если n не удовлетворяет условию - выведите сообщение об этом. Если пользователь ввёл не подходящее число,
// то программа должна просить пользователя повторить ввод. Создайте второй массив только из чётных элементов первого массива,
// если они там есть, и вывести его на экран.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a count of array elements: ");
        int n = sc.nextInt();
        if(n > 5 && n <= 10){
            int [] arr = new int [n];
        }
    }
}
