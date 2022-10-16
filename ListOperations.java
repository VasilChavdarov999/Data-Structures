import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] tokens = command.split( "\\s+");
            if (tokens[0].equals("Add")){
                numbers.add(Integer.parseInt(tokens[1]));
            }else if (tokens[0].equals("Insert")){
                numbers.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            }else if (tokens[0].equals("Remove")){
                numbers.remove(Integer.parseInt(tokens[1]));
            }else if (tokens[0].equals("Shift")){
                if (tokens[1].equals("left")){
                    for (int i = 0; i < Integer.parseInt(tokens[2]); i++) {
                        int savedNum = numbers.get(0);
                        for (int j = 0; j < numbers.size(); j++) {
                           numbers.set(j, j + 1);
                        }
                        numbers.set(numbers.lastIndexOf(i), savedNum);
                    }
                }else if (tokens[1].equals("right")){
                    for (int i = 0; i < Integer.parseInt(tokens[2]); i++) {
                        int savedNum = numbers.get(numbers.lastIndexOf(i));
                        for (int j = numbers.size() - 1; j >= 0; j--) {
                            numbers.set(numbers.get(j), numbers.get(j + 1));
                        }
                        numbers.set(savedNum, numbers.get(numbers.lastIndexOf(i)));
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
