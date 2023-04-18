package homework.Homework4;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        int [] arr =  {1, 6, 5, 7, 3, 7, 4, 2, 9, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(number == arr[i]){
                count++;
            }
        }
        if(count != 0) {
            System.out.println("Count of number: " + count);
        } else{
            System.out.println("This number is not in the array");
        }
    }
}

