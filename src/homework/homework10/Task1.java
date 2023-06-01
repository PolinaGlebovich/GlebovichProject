package homework.homework10;

import java.lang.String;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String document = scanner.nextLine();


        printBlocksWithNumbers(document);
        printReplaceToAsterisk(document);
        printOnlyLetters(document);
        printOnlyLettersByStringBuilder(document);
        printIfStringContainsAbc(document);
        printIfStringStartWithNumbers(document);
        printIfStringEndsWithSequence(document);

    }


    /**
     * Display the first two blocks of 4 digits on the screen in one line
     * @param document - document
     */
    private static void printBlocksWithNumbers(String document) {
        System.out.println(document.substring(0,4) + " " + document.substring(9,13));
    }


    /**
     * Display the document number on the screen, but replace blocks of three letters with *** (each letter will be replaced with *)
     * @param document - document
     */
    private static void printReplaceToAsterisk(String document) {
        StringBuilder builder = new StringBuilder(document);
        System.out.println(builder.replace(5,8,"***").replace(14,17,"***"));
    }


    /**
     * Display only one letter from the document number in the format yyy/yyy/y/y in lowercase
     * @param document - document
     */
    private static void printOnlyLetters(String document) {
        System.out.println(document.substring(5, 8) + "/" + document.substring(14, 17) + "/"  + document.charAt(19) + "/" + document.charAt(21));
    }


    /**
     * Display letters from the document number in the format "Letters:yyy/yyy/y/y"
     * @param document - document
     */
    private static void printOnlyLettersByStringBuilder(String document) {
        System.out.println("Letters: "
                + document.substring(5, 8) + "/"
                + document.substring(14, 17) + "/"
                + document.charAt(19) + "/"
                + document.charAt(21));
    }

    /**
     * Check if the document number contains the sequence abc and display a message if it does or not
     * @param document - document
     */
    private static void printIfStringContainsAbc(String document) {
        System.out.println(document.toLowerCase().indexOf("abc"));
    }

    /**
     * Check if the document number starts with the sequence 555
     * @param document - document
     */
    private static void printIfStringStartWithNumbers(String document) {
        System.out.println(document.startsWith("555"));
    }


    /**
     * check if the document number ends with the sequence 1a2b
     * @param document - document
     */
    private static void printIfStringEndsWithSequence(String document) {
        System.out.println(document.endsWith("1a2b"));
    }

}

