import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();



        while (scanner.hasNext()){
            String  brackets = scanner.nextLine();

            boolean isBalanced = true;

                for (int i = 0; i < brackets.length(); i++) {
                    if (brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '['){
                        stack.push(brackets.charAt(i));
                        if ((brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[')
                                && (i + 1 == brackets.length())){
                            isBalanced = false;
                            break;
                        }
                    }else {
                        if (stack.isEmpty()){
                            isBalanced = false;
                            break;
                        }
                        if (brackets.charAt(i) == '}' && stack.pop() != '{'){
                            isBalanced = false;
                        }else if (brackets.charAt(i) == ')' && stack.pop() != '('){
                            isBalanced = false;
                        }else if (brackets.charAt(i) == ']' && stack.pop() != '['){
                            isBalanced = false;
                        }
                    }
                }
                if (isBalanced){
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }

        }
    }
}
