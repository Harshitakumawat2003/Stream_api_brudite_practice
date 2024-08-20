public class Lambda {
    void hello();

    public static void main(String[] args) {
        Lambda h = () -> {
            System.out.println("hello world");
        };
        h.hello();
    }
}
