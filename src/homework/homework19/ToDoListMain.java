package homework.homework19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoListMain {
    public static void main(String[] args) throws JsonProcessingException {

        Scanner sc = new Scanner(System.in);

        String path = "toDoList.json";
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            ToDoList currentToDoList = objectMapper.readValue(new File(path), ToDoList.class);
            String date, task, priority, status;
            System.out.println("Write a date: ");
            date = sc.nextLine();
            System.out.println("Write a task: ");
            task = sc.nextLine();
            System.out.println("Write a priority: ");
            priority = sc.nextLine();
            System.out.println("Write a status: ");
            status = sc.nextLine();
            ToDo toDo = new ToDo(date, task, priority, status);
            extracted(currentToDoList, toDo);

            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), currentToDoList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void extracted(ToDoList currentToDoList, ToDo toDo) {
        currentToDoList.getToDo().add(toDo);
    }
}
