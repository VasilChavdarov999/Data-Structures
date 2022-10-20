import java.util.stream.IntStream;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        IntStream
                .rangeClosed(1,10)
                .forEach(System.out::println);

    }
}
