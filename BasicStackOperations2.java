import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int N = coordinates[0];
        int S = coordinates[1];
        int X = coordinates[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack =new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size() -1; i++) {
            if (stack.peek() < smallestNumber){
                smallestNumber = stack.peek();
                stack.pop();
            }
        }
        if (stack.size() <= 0){
            System.out.println(0);
        }else {
            for (int i = 0; i < stack.size() - 1; i++) {
                if (stack.peek() == X){
                    System.out.println("true");
                    break;
                }else {
                    System.out.println(smallestNumber);
                }
            }
        }
    }
}
