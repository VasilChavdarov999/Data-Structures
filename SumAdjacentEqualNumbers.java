import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Double::parseDouble).collect(Collectors.toList());

        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            Double num = Double.parseDouble(split[i]);
            numbers.add(num);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(numbers.get(i + 1));
                i = -1;
            }
        }
        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> numbers, String delimiter) {
        String output = "";
        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number) + delimiter);
        }
        return output;
    }
}
