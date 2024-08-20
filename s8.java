//8. Find Only Duplicate Elements with Their Count from a String ArrayList Using Streams

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class s8 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> duplicates = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicates: " + duplicates);
    }
}