import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinaryUsingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;
        List<Integer> binary = new ArrayList<>();
        while (number != 0){
            result = number % 2;
            number = number / 2;
            binary.add(result);
        }
        for (int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }
    }
}
