import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = listReading(scanner);
        List<Integer> secondList = listReading(scanner);

        List<Integer> resultList = new ArrayList<>();

        int i = 0;

        while (i < firstList.size() && i < secondList.size()) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
            i++;
        }
        List<Integer> list = new ArrayList<>();

        for (Integer integer : resultList) {
            System.out.print(integer + " ");
        }
        if (i < firstList.size()) {
            addToList(firstList, list, i);
        } else if (i < secondList.size()) {
            addToList(secondList, list, i);
        }
        for (Integer result : list) {
            System.out.print(result + " ");
        }
    }

    private static void addToList(List<Integer> firstList, List<Integer> list, int i) {
        for (int j = i; j < firstList.size(); j++) {
            list.add(firstList.get(j));
        }
    }

    public static  List<Integer> listReading(Scanner scanner){
       return  Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

    }
}
