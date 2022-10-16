import java.util.Arrays;
import java.util.Scanner;

public class PrintNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        for (int i = numbers.length - 1; i >= 0; i --) {
            System.out.print(numbers[i] + " ");
        }
    }
}
