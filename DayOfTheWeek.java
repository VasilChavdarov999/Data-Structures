import java.util.ArrayList;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


            if (day >= 1 && day <= 7){
                int chosenDay = day - 1;
                System.out.println(daysOfWeek[chosenDay]);
            }else {
                System.out.println("Invalid day!");
            }

    }
}
