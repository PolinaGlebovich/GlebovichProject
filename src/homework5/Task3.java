package homework5;

import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] arr1 = new int [3][3];
        int [][] arr2 = new int [3][3];
        int [][] arr3 = new int [3][3];

        System.out.println("The first array: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = random.nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second array: ");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = random.nextInt(10);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of arrays: ");
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
