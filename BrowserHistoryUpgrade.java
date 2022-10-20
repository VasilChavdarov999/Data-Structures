import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String temporary = "";
        while (true){

            String line = scanner.nextLine();
            String output = "";

            switch (line){
                case "back":
                    if (history.size() <= 1){
                        output = "no previous URLs";
                    }else {
                        temporary = history.peek();
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "forward":
                    if (history.size() < 1){
                        output = "no next URLs";
                    }else {
                        history.push(temporary);
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = line;
                    history.push(line);
            }
            System.out.println(output);
        }
    }
}
