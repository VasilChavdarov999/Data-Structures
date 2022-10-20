import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimalNum == 0){
            System.out.print(0);
        }else {
            while (decimalNum != 0){
                stack.push(decimalNum % 2);
                decimalNum /= 2;
            }
        }
        for (int i = stack.size() -1; i >= 0; i--) {
            System.out.print(stack.pop());
        }
    }
}
