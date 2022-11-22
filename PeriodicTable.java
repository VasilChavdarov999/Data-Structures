import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            set.addAll(Arrays.asList(tokens));

        }
        set.forEach(e -> System.out.print(e + " "));
        // System.out.println(String.join(" ", components));
    }
}
