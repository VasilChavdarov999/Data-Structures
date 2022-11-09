import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (!input.equals("END")){
            String[] tokens = input.split(",\\s+");
            if (tokens[0].equals("IN")){
                set.add(tokens[1]);
            }else {
                set.remove(tokens[1]);

            }
            input = scanner.nextLine();
        }
       if (set.isEmpty()){
           System.out.println("Parking Lot is Empty");
       }else {
           System.out.println(String.join(System.lineSeparator(), set));
       }
    }
}
