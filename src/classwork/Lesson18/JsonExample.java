package classwork.Lesson18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Objects;

public class JsonExample {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person(1, "Anton2", Arrays.asList("write", "dance"), true);
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(result);
        Person currentPerson = mapper.readValue(result, Person.class); // прочитать результат, Person, который из строчки
        System.out.println(currentPerson);
    }
}
