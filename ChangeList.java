import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Delete")){
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i).equals(Integer.parseInt(tokens[1]))){
                        numbers.remove(numbers.get(i));
                    }
                }
            }else if (tokens[0].equals("Insert")){
                numbers.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
            }

            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
