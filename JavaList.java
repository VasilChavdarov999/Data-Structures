import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numbers.add(nums[i]);
        }
        int numberOfQueries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfQueries; i++) {
            String command = scanner.nextLine();
            switch (command){
                case "Insert":
                    int[] functions = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt).toArray();
                    for (int j = 0; j <= numbers.size(); j++) {
                        if (j == functions[0]){
                            numbers.add(j, functions[1]);
                            break;
                        }
                    }
                    break;
                case "Delete":
                    int inputIndex = Integer.parseInt(scanner.nextLine());
                    for (int j = 0; j < numbers.size(); j++) {
                        if (j == inputIndex){
                            numbers.remove(j);
                            break;
                        }
                    }
                    break;
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
