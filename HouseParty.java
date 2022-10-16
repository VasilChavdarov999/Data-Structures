import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> namesOfTheGuests = new ArrayList<>();

        for (int i = 0; i < countOfCommands; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+");

            if (tokens[2].equals("going!")){
                boolean isTrue = false;
                for (int j = 0; j < namesOfTheGuests.size(); j++) {
                    if (namesOfTheGuests.get(j).equals(tokens[0])){
                        isTrue = true;
                        break;
                    }
                }
                if (isTrue){
                    System.out.printf("%s is already in the list!%n", tokens[0]);
                }else {
                    namesOfTheGuests.add(tokens[0]);
                }
            }else if (tokens[2].equals("not")){
                boolean isTrue = false;
                for (int j = 0; j < namesOfTheGuests.size(); j++) {
                    if (namesOfTheGuests.get(j).equals(tokens[0])){
                        namesOfTheGuests.remove(namesOfTheGuests.get(j));
                        isTrue = false;
                        break;
                    }else {
                        isTrue = true;
                    }
                }
                if (isTrue){
                    System.out.printf("%s is not in the list!%n", tokens[0]);
                }

            }
        }
        for (String namesOfTheGuest : namesOfTheGuests) {
            System.out.println(namesOfTheGuest);
        }
    }
}
