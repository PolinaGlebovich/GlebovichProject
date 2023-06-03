package homework.homework17;
import javax.print.Doc;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Программа на вход получает путь к папке (задается через консоль).
//В заданной папке находятся текстовые файлы (формат тхт).  my_file.txt
//Каждый файл содержит произвольный текст.
// В этом тексте может быть номер документа(один или несколько), емейл и номер телефона. номер документа в формате:
//xxxx-yyy-xxxx-yyy-xyxy, где x - это любая цифра, а y - это любая буква латинского алфавита, номер телефона в формате: +(ХХ)ХХХХХХХ
//Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое поле.
// Извлеченную информацию необходимо сохранить в следующую структуру данных: Map, где ключ типа String -
// это имя документа без расширения (вырезается из названия файла), значение типа Document -
// объект кастомного класса, поля которого содержат извлеченную из текстового документа информацию.
// Класс Document имеет следующие поля — List<String> documents (тут номера документов),
// String phoneNumber (можно Optional<String>), String email (можно Optional<String>).

//
public class DocMain {
    public static void main(String[] args) throws IOException {

        System.out.println(getDoc("my_file.txt"));

    }

    public static Document getDoc(String nameOfFile) throws IOException {
        Document doc = new Document();
        try (FileReader reader = new FileReader(nameOfFile);
             Scanner scanner2 = new Scanner(reader)) {
            List<String> documents = new ArrayList<>();
            while (scanner2.hasNext()) {
               String str = scanner2.nextLine();
                if(isEmailValid(str)){
                    doc.setEmail(str);
                } else if(isPhoneNumberValid(str)) {
                    doc.setPhoneNumber(str);
                 }
                 else if(isDocumentValid(str)){
                    documents.add(str);
                 }
                doc.setDocuments(documents);
            }
        }
       return doc;
    }

        public static boolean isDocumentValid (String str){
            Pattern docNum = Pattern.compile("(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}");
            Matcher matcher = docNum.matcher(str);

            return matcher.matches();
        }
        public static boolean isEmailValid (String str){
            Pattern email = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
            Matcher matcher = email.matcher(str);
            return matcher.matches();
        }
        public static boolean isPhoneNumberValid (String str){
            Pattern phoneNumber = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
            Matcher matcher = phoneNumber.matcher(str);
            return matcher.matches();
        }
}


