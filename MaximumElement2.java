import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaximumElement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            switch (command[0]){
                case 1:
                    stackOfNumbers.push(command[1]);
                    break;
                case 2:
                    stackOfNumbers.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stackOfNumbers));
                    break;
            }
        }
    }
}
