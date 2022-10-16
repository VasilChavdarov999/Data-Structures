import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
              .mapToInt(Integer::parseInt)
              .toArray();
      int n = Integer.parseInt(scanner.nextLine());
      int currentNum = 0;

      for (int i = 0; i < n; i++) {
          currentNum = inputArr[0];
          for (int j = 0; j < inputArr.length - 1; j++) {
             inputArr[j] = inputArr[j + 1];
          }
          inputArr[inputArr.length - 1] = currentNum;
      }
      for (int i : inputArr) {
          System.out.print(i + " ");
      }
  }
}
