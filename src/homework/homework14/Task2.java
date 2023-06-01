package homework.homework14;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        int countOfDaysToTuesday = 9 - currentDate.getDayOfWeek().getValue();

        if(countOfDaysToTuesday == 8){
            countOfDaysToTuesday = 1;
        }

        System.out.println(currentDate.plusDays(countOfDaysToTuesday));
    }
}
