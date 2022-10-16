import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Add")){
                numbers.add(Integer.parseInt(tokens[1]));
            }else {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) + Integer.parseInt(tokens[0]) <= maxCapacity){
                       numbers.set(i, numbers.get(i) + Integer.parseInt(tokens[0]));
                       break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
