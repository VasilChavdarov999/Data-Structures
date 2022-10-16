import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int topNumber = 0;
        boolean isTrue = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            isTrue = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    topNumber = numbers[i];
                }else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue){
                System.out.print(topNumber + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
