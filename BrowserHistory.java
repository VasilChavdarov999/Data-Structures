import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String currentURL = "";
        ArrayDeque<String> numbers = new ArrayDeque<>();

        while (!command.equals("Home")){
            if (command.equals("back")){
                if (numbers.isEmpty()){
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                String prevURL = numbers.pop();
                currentURL = prevURL;
            }else {
                if (!currentURL.equals("")){
                    numbers.push(currentURL);
                }
                currentURL = command;

            }
            System.out.println(currentURL);
            command = scanner.nextLine();
        }
    }
}
