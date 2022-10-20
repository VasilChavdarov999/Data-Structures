import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kidsNames = scanner.nextLine();
        String[] tokens = kidsNames.split("\\s+");

        int count = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, tokens);
        int currentRound = 1;

        while (queue.size() > 1){
            for (int i = 0; i < count; i++) {
                if (currentRound % count != 0){
                    queue.offer(queue.poll());
                }else {
                    System.out.printf("Removed %s%n", queue.poll());
                }
                currentRound++;
            }
        }
        System.out.printf("Last is %s%n", queue.poll());
    }
}
