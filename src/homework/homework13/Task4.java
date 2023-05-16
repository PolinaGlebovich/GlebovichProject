package homework.homework13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        getMyLists();
    }
    private static void getMyLists() {
        List<String> myList = new ArrayList<>();
        File file = new File("file1.txt");
        try (FileReader fileReader = new FileReader(file);
             FileWriter writer = new FileWriter("file2.txt");
             Scanner scanner = new Scanner(fileReader)) {

            while (scanner.hasNext()) {
                String str = scanner.nextLine() + "\n";
                myList.add(str);
            }
            writer.write(reverseList(myList));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String reverseList (List<String> myList){
        List<String> myReverseList = new ArrayList<>(myList);
        Collections.reverse(myReverseList);
        return myReverseList.toString();
    }
}
