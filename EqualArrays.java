import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;
        int sum = 0;
        boolean istrue = false;

        for (int i = 0; i < secondArr.length; i++) {
            if (firstArr[i] == secondArr[i]){
                istrue = true;
                count ++;
                sum += secondArr[i];
            }else {
                istrue = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", count);
                return;
            }
        }
        if (istrue){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
