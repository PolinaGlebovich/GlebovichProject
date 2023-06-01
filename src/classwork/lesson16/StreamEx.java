package classwork.lesson16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args)  {

        List<Integer> testValues = Arrays.asList(1, 2, 5, 3, 2, 1);
        Map<Integer, Long> result = testValues.stream()
                .collect(Collectors.groupingBy
                        (Function.identity(),
                                Collectors.counting()));

        System.out.println(result);

    }
}
