import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")){
            if (command[0].equals("Add")){
                list.add(Integer.parseInt(command[1]));
            }else if (command[0].equals("Remove")){
                list.remove(Integer.valueOf(command[1]));
            }else if (command[0].equals("RemoveAt")){
                for (int i = 0; i < list.size(); i++) {
                    if (Integer.parseInt(command[1]) == i){
                        list.remove(Integer.parseInt(command[1]));
                    }
                }
            }else if (command[0].equals("Insert")){
                list.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            command = scanner.nextLine().split("\\s+");
        }
        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }
}
