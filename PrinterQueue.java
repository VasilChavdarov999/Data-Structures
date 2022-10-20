import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String printerInput = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!printerInput.equals("print")){
            if (!printerInput.equals("cancel")){
                queue.offer(printerInput);
            }else {
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s%n", queue.poll());
                }
            }
            printerInput = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
