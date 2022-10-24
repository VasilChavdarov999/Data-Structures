import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();

        ArrayDeque<Character> openingBracketsStack = new ArrayDeque<>();

        boolean isBalanced = true;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '['){
                openingBracketsStack.push(brackets.charAt(i));
            }else {
                if (openingBracketsStack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                if (brackets.charAt(i) == '}' && openingBracketsStack.pop() != '{'){
                    isBalanced = false;
                }else if (brackets.charAt(i) == ')' && openingBracketsStack.pop() != '('){
                    isBalanced = false;
                }else if (brackets.charAt(i) == ']' && openingBracketsStack.pop() != '['){
                    isBalanced = false;
                }
            }
        }
        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
