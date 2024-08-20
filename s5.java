//5  Concatenate Two Streams
import java.util.stream.Stream;

public class s5 {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Arya", "B", "C");
        Stream<String> stream2 = Stream.of("D", "E", "F");
//String stream1 = "hello";
//String stream2 = "World";
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);

        concatenatedStream.forEach(System.out::print);
    }
}
