package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int [][][] arr = new int [3][3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] = sc.nextInt();    // заполняем массив
                    arr[i][j][k] = arr[i][j][k] + n;  // прибавляем к каждому элемету n
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
