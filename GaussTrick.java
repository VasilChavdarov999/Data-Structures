import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int firstNum = numbers.get(i);
            int lastNum = numbers.get(numbers.size() - 1);
            sum = (firstNum+ lastNum);
            System.out.print(sum + " ");

            numbers.remove(firstNum);
            numbers.remove(lastNum);
        }

    }
}
