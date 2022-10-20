import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, tokens);
        int currentRound = 1;

        while (queue.size() > 1){
            for (int i = 1; i < n; i++) {
                queue.offer(queue.remove());
            }
            if (!isPrime(currentRound)){
                System.out.println("Removed " + queue.remove());
            }else {
                System.out.println("Prime " + queue.peek());
            }
            currentRound++;
        }
        System.out.println("Last is " + queue.remove());
    }

    private static boolean isPrime(int number) {
        if (number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}




