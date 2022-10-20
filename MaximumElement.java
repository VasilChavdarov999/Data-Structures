import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        ArrayDeque<String> stackOfElements = new ArrayDeque<>();
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "1":
                    stackOfElements.push(tokens[1]);
                    break;
                case "2":
                    stackOfElements.pop();
                    break;
                case "3":
                    for (int j = 0; j <= stackOfElements.size(); j++) {
                        if (maxNumber < Integer.parseInt(stackOfElements.peek())){
                            maxNumber = Integer.parseInt(stackOfElements.peek());
                            if (stackOfElements.size() <= 1){
                                break;
                            }else {
                                stackOfElements.pop();
                            }
                        }
                    }
                    System.out.println(maxNumber);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
