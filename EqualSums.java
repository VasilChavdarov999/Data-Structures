import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean isTrue = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = i - 1; j >= 0 ; j--) {
                leftSide += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSide += numbers[j];
            }
            if (leftSide == rightSide){
                index = i;
                isTrue = true;
            }
        }
        if (isTrue){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
