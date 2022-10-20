import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

            int N = coordinates[0];
            int S = coordinates[1];
            int X = coordinates[2];


        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if (stack.size() < 1){
            System.out.println(0);
        }else {
            boolean isTrue = true;
            int smallestNumber = Integer.MAX_VALUE;
            for (int i = 0; i < stack.size(); i++) {
                if (X == stack.peek()){
                    isTrue = false;
                    System.out.println("true");
                    break;
                }else {
                    if (smallestNumber > stack.peek()){
                        smallestNumber = stack.peek();
                    }
                }
                stack.pop();
            }
            if (isTrue){
                System.out.println(smallestNumber);
            }
        }
    }
}
