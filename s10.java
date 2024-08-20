//10. Print the Count of Each Character in a String

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class s10 {

    public static void main(String[] args) {
        String input = "hello world";

        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Count: " + characterCount);
    }
}