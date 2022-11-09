import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();


        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")){
            char staringSymbol = reservationNumber.charAt(0);
            boolean isVipReservation = Character.isDigit(staringSymbol);
            guests.add(reservationNumber);
            reservationNumber = scanner.nextLine();
        }
        String guestReservation = scanner.nextLine();

        while (!guestReservation.equals("END")){
            guests.remove(guestReservation);
            guestReservation = scanner.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}
