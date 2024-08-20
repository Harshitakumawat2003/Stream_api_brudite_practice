//3. Find the First Repeated Character in a String Using Streams

import java.util.HashSet;
import java.util.Set;
public class s3 {
    public static void main(String[] args) {
        String input = "swiss";

        Set<Character> seen = new HashSet<>();
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character: " + result);
    }
}
