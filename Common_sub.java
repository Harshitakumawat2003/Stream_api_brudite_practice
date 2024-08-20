//2. Find the First Non-Repeated Character in a String Using Streams

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Common_sub
{
    public static void main(String[] args) {
        String input = "swiss";

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeated character: " + result);
    }
}
