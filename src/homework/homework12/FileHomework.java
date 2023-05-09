package homework.homework12;

import java.io.*;
import java.util.Scanner;

public class FileHomework {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = getFileName();
        sortDocNumbers(fileName);
    }

    private static void sortDocNumbers(String fileName) {
        try (FileReader reader = new FileReader(fileName);
             FileWriter writer = new FileWriter("results.txt");
             FileWriter writer1 = new FileWriter("failed_results.txt");
             Scanner scanner = new Scanner(reader)) {

                while (scanner.hasNext()) {
                    String str = scanner.nextLine();
                    fillRowInNeededDocument(writer, writer1, str);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    private static String getFileName() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException("File " + fileName + " not found");
        }
        return fileName;
    }

    private static void fillRowInNeededDocument (FileWriter writer, FileWriter writer1, String str) throws
        IOException {
            if (isDocNumberValid(str)) {
                writer.write(str);
            } else {
                writer1.write(str);
            }
        }
        private static boolean isDocNumberValid (String str){
            return str.length() == 15 && str.startsWith("contract") || str.startsWith("docnum");
        }
}



