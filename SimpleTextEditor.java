
import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> commands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            String rowCommand = scanner.nextLine();
            String[] commandArguments = rowCommand.split("\\s+");
            String commandType = commandArguments[0];

            switch (commandType){
                case "1":
                    commands.push(rowCommand);
                    executeAdd(commandArguments[1], text);
                    break;
                case "2":
                    commands.push(rowCommand);
                    int countToDelete = Integer.parseInt(commandArguments[1]);
                    StringBuilder elementsToBeDeleted = new StringBuilder();
                    for (int j = text.length() - countToDelete; j < text.length() ; j++) {
                        elementsToBeDeleted.append(text.charAt(j));
                    }
                    removedElements.push(elementsToBeDeleted.toString());
                    executeDelete(countToDelete, text);
                    break;
                case "3":
                    int index = Integer.parseInt(commandArguments[1]);
                    System.out.printf("%s%n", text.charAt(index - 1));
                    break;
                case "4":
                    String lastCommand = commands.pop();
                    String[] lastCommandArguments = lastCommand.split("\\s+");
                    String lastCommandType = lastCommandArguments[0];
                    switch (lastCommandType){
                        case "1":
                            int elementsToDelete = lastCommandArguments[1].length();
                            executeDelete(elementsToDelete, text);
                            break;
                        case "2":
                            String elementToAddBack = removedElements.pop();
                            executeAdd(elementToAddBack, text);
                            break;
                    }
                    break;
            }
            
        }
    }

    private static void executeDelete(int countToDelete, StringBuilder text) {
        for (int i = 0; i < countToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }
    }

    private static void executeAdd(String commandArgument, StringBuilder text) {
        text.append(commandArgument);
    }


}
