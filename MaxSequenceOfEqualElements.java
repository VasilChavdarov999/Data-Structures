import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int sequence = 1;
        int index = 0;
        int bestSequence = 0;

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] == numbers[i + 1]){
                sequence ++;
                if (sequence > bestSequence){
                    bestSequence = sequence;
                    index = i + 1;
                }
            } else {
                sequence = 1;
            }
        }

        for (int i = index; i > index - bestSequence; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
