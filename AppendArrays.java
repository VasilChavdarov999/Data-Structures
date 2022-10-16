import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] input = scanner.nextLine().split("\\|");
       List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] Arr = input[i].trim().split("\\s+");
            for (String element : Arr) {
                result.add(element);
            }
            result.remove("");
        }
        System.out.println(String.join(" ", result));
    }
}
