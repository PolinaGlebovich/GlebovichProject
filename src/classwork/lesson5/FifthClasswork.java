package classwork.lesson5;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Random;

public class FifthClasswork {
    public static void main(String[] args) {
        multiplyAndPrintArrays();

        //int [] arr = new int [10];
//        int [][] arr2 = new int [10][10];
//
//        for(int i = 0; i < arr2.length; i++){
//            for(int j = 0; j < arr2[i].length; j++){
//                arr2[i][j] = i * j;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2));
//
//        for(int i = 0; i < arr2.length; i++){
//            for(int j = 0; j < arr2[i].length; j++){
//                System.out.print("arr[i][j] = " + arr2[i][j]);
//            }
//            System.out.println();
//        }
//
//        int [][] arr3 = new int [4][];
//        for(int i = 0; i < arr3.length; i++){
//                arr3[i] = new int [i + 1];
//            Arrays.fill(arr3[i], i + 1);
//            System.out.print(Arrays.toString(arr3[i]) + " ");
//            System.out.println();
//        }
//
//        Random random = new Random();
//        int [][] arr4 = new int [5][5];
//        for(int i = 0; i < arr4.length; i++){
//            for(int j = 0; j < arr4[i].length; j++){
//                arr4[i][j] = random.nextInt(10);
//                System.out.print(arr4[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        int [] arr = new int [10];
//        int [] newArray = new int [11];
//        arr[9] = 1;
//        System.out.println(Arrays.equals(arr,newArray));

//        int [][][] superArray = new int [11][11][11];
//        for(int i = 0; i < superArray.length; i++){
//            for(int j = 0; j < superArray[i].length; j++){
//                for(int k = 0; k < superArray[i][j].length; k++){
//                    System.out.print(" arr[" + i + "][" + j + "][" + k + "] = " + superArray[i][j][k]);
//                }
//            }
//            System.out.println();
//        }

    }
    private static void multiplyAndPrintArrays(){
        int [][] arr1 = new int [3][3];
        int [][] arr2 = new int [3][3];
        int [][] result = new int [3][3];
        Random random = new Random();

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                result[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();

        }
    }
}
