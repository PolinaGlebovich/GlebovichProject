package homework5;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int [4][4];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

            for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j][j] + " ");
            }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i][arr.length - i - 1] + " ");

        }
    }
}
