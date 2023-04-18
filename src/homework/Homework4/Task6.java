package homework.Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("Fill in the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(i % 2 != 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
