import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(key -> {
                    if (map.containsKey(key)){
                        int oldCount = map.get(key);
                        int newCount = oldCount + 1;
                        map.put(key, newCount);
                    }else {
                        map.put(key, 1);
                    }
                });

        for (Map.Entry<Double, Integer> doubleIntegerEntry : map.entrySet()) {
            System.out.println(String.format("%.1f -> %d", doubleIntegerEntry.getKey(),
                    doubleIntegerEntry.getValue()));
        }
    }
}
