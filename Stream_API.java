import java.util.*;
public class Stream_API {
    public static void main(String[] args) {
        // Dummy List
        List<String> list = Arrays.asList("apple", "banana", "orange");

        // Dummy Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Dummy Set
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));

        // List Stream Example
        list.stream().forEach(System.out::println);

        // Map Stream Example
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        // Set Stream Example
        set.stream().forEach(System.out::println);
    }
}