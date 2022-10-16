import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                if (numbers[i] + numbers[j + 1] == number){
                    System.out.print(numbers[i] + " " + numbers[j + 1]);
                    System.out.println();
                    break;
                }
            }
        }
    }
}
