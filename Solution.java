import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if (S.length() >= 1 && S.length() <= 100){
            for (int i = 0; i < S.length(); i++) {
                String[] tokens = S.split("");
                if (i == start){
                    for (int j = i; j <= end - 1; j++) {
                        System.out.print(tokens[j]);
                    }
                }
            }
        }
    }
}
