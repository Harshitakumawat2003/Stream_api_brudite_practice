//4. Sort a List of Integers Using Streams
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedNumbers);
    }
}
