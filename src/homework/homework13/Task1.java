package homework.homework13;
import java.util.*;

//Дан текст, нужно прочитать все введенные в нем слова, и вывести их в алфавитном порядке.
public class Task1 {
    public static void main(String[] args) {
        String text = "на краю дороги стоял дуб вероятно в десять раз старше берез составлявших лес он был в десять раз толще и в два раза выше каждой березы";
        String [] str = text.split(" ");
        Set<String> mySet = new TreeSet<>(Arrays.asList(str));
        System.out.println(mySet);
    }

    }

