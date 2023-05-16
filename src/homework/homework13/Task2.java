package homework.homework13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//В файле записаны различные числа, нужно вывести на экран все по одному разу (т. е. исключить дубликаты
public class Task2 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        File file = new File("C:\\Users\\37529\\IdeaProjects\\GlebovichProject\\numbers.txt");
        try (FileReader reader = new FileReader(file);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                 mySet.add(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(mySet);
    }
}
