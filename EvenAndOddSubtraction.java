import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();

        String[] elements = scanner.nextLine().split("\\s+");
        int[] nums = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            nums[i] += Integer.parseInt(elements[i]);
        }

        int evenNums = 0;
        int oddNums = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenNums += nums[i];
            }else {
                oddNums += nums[i];
            }
        }
        System.out.println(evenNums - oddNums);
    }
}
