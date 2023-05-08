package homework.homework11;

import java.util.Scanner;

//Доработать нулевое домашнее задание предыдущего урока. Теперь надо создать свои классы исключений на каждую ситуацию:
//- Проверить содержит ли номер документа последовательность abc.
//- Проверить начинается ли номер документа с последовательности 555.
//- Проверить заканчивается ли номер документа на последовательность 1a2b.
// Если номер документа не удовлетворяет условию - то "бросить" исключение.
// В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить исключение конструкцией try-catch
// и в блоке catch вывести сообщение для пользователя (сообщение на консоль).
public class DocumentExceptions {
    private static void printIfStringContainsAbc(String document) throws StringAbcException {
        if(document.contains("abc")){
            System.out.println("This document contains string \"abc\"");
        } else throw new StringAbcException("This document doesn't contain string \"abc\"", document);

    }

    private static void printIfStringStartWithNumbers(String document) throws DocStartWithStringException {
        if(document.startsWith("555")){
            System.out.println("This string starts with \"555\"");
        } else throw new DocStartWithStringException("This string doesn't start with \"555\"", document);
    }

    private static void printIfStringEndsWithSequence(String document) throws DocEndWithStringException {
        if(document.endsWith("1a2b")){
            System.out.println("This string ends with \"1a2b\"");
        } else throw new DocEndWithStringException("This string doesn't end with \"1a2b\"", document);
    }
        public static void main(String[] args) {

            String trueDocument = "5555-abc-3941-wef-1a2b";
            System.out.println("Please, enter your document version");
            Scanner scanner = new Scanner(System.in);
            String currentDocument = scanner.nextLine();

            try {
                printIfStringContainsAbc(currentDocument);

            } catch (StringAbcException e){
                System.out.println(e.getMessage());
            }

            try {
                printIfStringEndsWithSequence(currentDocument);
            }
            catch (DocEndWithStringException a){
                System.out.println(a.getDocument());
            }

            try{
                printIfStringStartWithNumbers(currentDocument);
            }
            catch (DocStartWithStringException b) {
                System.out.println(b.getMessage());
            }
            System.out.println("Current document is " + trueDocument);
        }
}
