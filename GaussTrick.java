import com.sun.source.tree.LiteralTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String line = scanner.nextLine();
//        String[] elements = line.split(" ");
//        List<Double> numbers = new ArrayList<>();
//        for (int i = 0; i < elements.length; i++) {
//            double num = Double.parseDouble(elements[i]);
//            numbers.add(num);
//        }
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
               .map(Integer::parseInt).collect(Collectors.toList());



        for (int i = 0; i < numbers.size() -1; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.get(numbers.size() - 1));
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
