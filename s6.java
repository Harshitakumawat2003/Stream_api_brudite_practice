//6. Convert a List of Objects into a Map with Duplicate Keys, Stored in Sorted Order
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class s6 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

        System.out.println("Map: " + map);
    }
}

