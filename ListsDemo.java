import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>(Arrays.asList("10", "10", "20", "30", "40", "50"));

        for (String integer : list) {
            System.out.print(integer + " ");
        }
        list.remove("50");
        System.out.println();
        System.out.println("---------------------------------------");

        for (String integer : list) {
            System.out.print(integer + " ");
        }


    }
}
