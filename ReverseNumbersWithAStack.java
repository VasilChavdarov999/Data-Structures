import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < elements.length; i++) {
            stack.push(elements[i]);
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.pop() + " ");
        }

//        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt).toArray();
//
//        for (int i = numbers.length -1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }

    }
}
