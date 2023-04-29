package classwork.Lesson10;

import java.util.Scanner;

public class MyBestException {
    public static void main(String[] args) {
        // мы попросим угадать человека возраст
        // если разбежка в большую сторону и больше 5 лет - ошибка(видимо охренел)
        // если в меньшую сторону - ошибка (льстец)
        int currentAge = 30;
        System.out.println("Please, enter guessed age");
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();
        try {
            boolean isGameContinue = checkAge(currentAge, guessedAge);


            while (isGameContinue) {
                System.out.println("Please, enter guessed age again");
                guessedAge = scanner.nextInt();

                isGameContinue = checkAge(currentAge, guessedAge);
            }
        } catch (MyBestExceptionExample e){
            System.out.println("My age is " + e.getAge() + ". " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("This is the end");
    }
    private static boolean checkAge(int currentAge, int guessedAge) throws MyBestExceptionExample {
        int result = currentAge - guessedAge;
        // если угадал - то мы говорим угадал
        if(result == 0){
            System.out.println("You are right!!!");
            return false;
            }
        if(result > -5 && result < 5){
            //если плюс минус 5 лет - мы говорим не угадал
            System.out.println("Try again, you are close enough");
            return true;
        }
        if (result > 5) throw new MyBestExceptionExample("You are not an age expert!!!(flirt version)", currentAge);
        //return false;
        throw new MyBestExceptionExample("You are totally not an age expert!!!(angry version)", currentAge);
    }
}
