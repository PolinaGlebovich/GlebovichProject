package classwork.lesson12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("abc.doc", true)){
            writer.write("this is my string\n");
            writer.flush();
            writer.write("this is my second string");
            writer.write("this is my third string");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
