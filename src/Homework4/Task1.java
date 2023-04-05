package Homework4;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        int [] arr =  {1, 6, 5, 7, 3, 7, 4, 2, 9, 5};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(number != arr[i]){
                System.out.println("This number is not include in the array");
                break;
            }
            else{
                System.out.println("This number is include in the array");
            }
        }
    }
}

