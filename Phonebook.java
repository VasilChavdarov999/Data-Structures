import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new HashMap<>();

        while (!input.equals("search")){
            String[] tokens = input.split("-");
            map.put(tokens[0], tokens[1]);
            input = scanner.nextLine();
        }
         input = scanner.nextLine();
        while (!input.equals("stop")){
            if (map.containsKey(input)){
                System.out.printf("%s" + " -> " + "%s%n", input, map.get(input));
            }else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
