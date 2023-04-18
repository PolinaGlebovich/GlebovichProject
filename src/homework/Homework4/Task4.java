package homework.Homework4;

import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int [] arr1 = {10, 3, 7, 1, 5};
        int [] arr2 = {3, 6, 2, 1, 8};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        float sum1 = 0;
        float sum2 = 0;

        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            sum2 += arr2[j];
        }
        System.out.println("Arithmetic mean of the first array: " + sum1 / 5);
        System.out.println("Arithmetic mean of the second array: " + sum2 / 5);
        if(sum1 > sum2){
            System.out.println("The arithmetic mean of the 1st array is greater than the second");
        } else if(sum2 > sum1){
            System.out.println("The arithmetic mean of the 2nd array is greater than the first");
        } else{
            System.out.println("Arithmetic means are equal");
        }

    }
}
