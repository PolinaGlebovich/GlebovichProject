package homework.homework14;

import java.time.LocalDate;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date: ");

        String date = scanner.nextLine();

        LocalDate dateParse = LocalDate.parse(date);
        System.out.println(dateParse.getDayOfWeek());


    }
}
