
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> collectedNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            collectedNumbers.add(numbers.get(i));
            collectedNumbers.add(numbers2.get(i));
        }
        for (Integer collectedNumber : collectedNumbers) {
            System.out.print(collectedNumber + " ");
        }
    }
}
