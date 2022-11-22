import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] setSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = setSize[0];
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            set1.add(number);
        }
        int secondSetSize = setSize[1];
        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            set2.add(number);
        }
        set1.retainAll(set2);
        set1.forEach(e -> System.out.print(e + " "));

    }
}
