import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       if (n >= 1 && n <= 7){
           int dayOfWeek = n - 1;
           System.out.println(days[dayOfWeek]);
       }else {
           System.out.println("Invalid day!");
       }
    }
}
