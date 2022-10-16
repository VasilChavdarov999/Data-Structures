import java.util.Scanner;

public class DaysOfWeek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (n >= 1 && n <= 7){
            int dayOfWeek = n -1;
            System.out.println(daysOfWeek[dayOfWeek]);
        }else {
            System.out.println("Invalid Day!");
        }
    }
}
