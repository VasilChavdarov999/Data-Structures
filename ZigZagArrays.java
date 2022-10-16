import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for (int i = 0; i < n; i++) {
            int[] inputArr1 = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            if (i % 2 == 0){
                firstArr[i] += inputArr1[0];
                secondArr[i] += inputArr1[1];
            }else {
                firstArr[i] += inputArr1[1];
                secondArr[i] += inputArr1[0];
             }
        }
        for (int first : firstArr) {
            System.out.print(first + " ");
        }
        System.out.println();
        for (int second : secondArr) {
            System.out.print(second + " ");
        }

    }
}
