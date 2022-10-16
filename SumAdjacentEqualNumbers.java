


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nums = scanner.nextLine();
        String[] split = nums.split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            double num = Double.parseDouble(split[i]);
            numbers.add(num);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))){
                double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, sum);
                i = -1;
            }
        }
        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
