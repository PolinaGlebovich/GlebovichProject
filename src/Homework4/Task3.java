package Homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        float mid = 0;

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10);

            if(arr[i] < min){
                min = arr[i];
            } else if(arr[i] > max){
                max = arr[i];      // так и не поняла, как найти минимальное :/

            }
        }
        System.out.println("Max number in array: " + max);
        System.out.println("Min number in array: " + min);
        System.out.println(Arrays.toString(arr));
    }
}
