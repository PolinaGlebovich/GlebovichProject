package classwork.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {

       // File file = new File("abc2.doc");
        File file = new File("C:\\Users\\37529\\IdeaProjects\\GlebovichProject\\out2\\abc3.doc");
        File file2 = new File("out2");
        String str = "hello\tworld";
        System.out.println(str);

        System.out.println(file.exists()); // проверка, есть ли такой файл
        // Если добавить в корневую папку, то он его надёт, либо нужно указывать путь к файлу

        System.out.println(file.isFile()); // это файл или нет
        System.out.println(file2.isDirectory()); // это папка или нет --> true

        file2.mkdir(); // создаёт папку

        System.out.println(file.isHidden());  // скрытый файл или нет
        System.out.println(file2.getAbsolutePath()); // посмотреть абсолютный путь
        System.out.println(file.getCanonicalFile());
        System.out.println(new File(file.getParent()).getParent());
        File file3 = new File("C:\\Users\\37529\\IdeaProjects\\GlebovichProject");
        System.out.println(Arrays.toString(file3.listFiles(new DocFilter())));
        System.out.println(Arrays.toString(file3.listFiles()));
        System.out.println(file.createNewFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        //System.out.println(file.canExecute());
        System.out.println(file.getUsableSpace());
        System.out.println(file.renameTo(new File("abc4.doc")));
        System.out.println(file.setReadOnly());
        System.out.println(file.setReadable(true));
        System.out.println(file.setWritable(false));
        System.out.println(file.lastModified());

        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println("File is not created by some reason: " + e);
        }

        System.out.println(file.delete()); // удаление

    }
}
