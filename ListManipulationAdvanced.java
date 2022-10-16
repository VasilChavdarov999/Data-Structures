import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
           switch (command[0]){
               case "Contains":
                   if (list.contains(Integer.parseInt(command[1]))){
                           System.out.print("Yes");
                   }else {
                           System.out.print("No such number");
                   }
               System.out.println();
                   break;
               case "Print":
                   if (command[1].equals("even")){
                       for (int i = 0; i < list.size(); i++) {
                           if (list.get(i) % 2 == 0){
                               System.out.print(list.get(i) + " ");
                           }
                       }
                       System.out.println();
                   }else if (command[1].equals("odd")){
                       for (int i = 0; i < list.size(); i++) {
                           if (list.get(i) % 2 != 0){
                               System.out.print(list.get(i) + " ");
                           }
                       }
                       System.out.println();
                   }
               case "Get":
                   int sum = 0;
                   if (command[1].equals("sum")){
                       for (int i = 0; i < list.size(); i++) {
                           sum += list.get(i);
                       }
                       System.out.println(sum);
                   }
               case "Filter":
                   if (command[1].equals("<") || command[1].equals(">") ||
                           command[1].equals("<=") || command[1].equals(">=")){
                       if (command[1].equals("<")){
                           for (int i = 0; i < list.size(); i++) {
                                   if (list.get(i) < Integer.parseInt(command[2])){
                                       System.out.print(list.get(i) + " ");
                                   }
                           }
                           System.out.println();
                       }else if (command[1].equals(">")){
                           for (int i = 0; i < list.size(); i++) {
                               if (list.get(i) > Integer.parseInt(command[2])){
                                   System.out.print(list.get(i) + " ");
                               }
                           }
                           System.out.println();
                       }else if (command[1].equals("<=")){
                           for (int i = 0; i < list.size(); i++) {
                               if (list.get(i) <= Integer.parseInt(command[2])){
                                   System.out.print(list.get(i) + " ");
                               }
                           }
                           System.out.println();
                       }else {
                           for (int i = 0; i < list.size(); i++) {
                               if (list.get(i) >= Integer.parseInt(command[2])){
                                   System.out.print(list.get(i) + " ");
                               }
                           }
                           System.out.println();
                       }


                   }
           }

            command = scanner.nextLine().split(" ");
        }
    }
}
