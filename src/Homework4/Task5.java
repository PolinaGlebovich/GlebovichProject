package Homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        if (n > 5 && n <= 10) {
            int[] arr = new int[n];
            int[] arr1;
            int num = 0; // чётные числа
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();


                arr1 = arr;
                for (int j = 0; j < arr1.length; j++) {
                    if(arr[i] % 2 == 0){
                        arr[j] = arr[i];
                        System.out.print(arr[j] + " ");
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("Enter other array size");
        }
    }
}
