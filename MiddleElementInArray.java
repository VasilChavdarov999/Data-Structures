import java.util.Arrays;
import java.util.Scanner;

public class MiddleElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int middleElement = 0;

        if (arr.length % 2 != 0){
             middleElement = arr[arr.length / 2];
        }else {
            System.out.println("The array length is with odd count.");
            return;
        }
        System.out.println(middleElement);
    }
}

