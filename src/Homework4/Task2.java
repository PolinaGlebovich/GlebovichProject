package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 7, 5, 2, 1, 5, 7, 8};
        System.out.println("Enter the indicated number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
