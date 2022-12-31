import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Path pathOfTheFile = Path.of("C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> list = Files.readAllLines(pathOfTheFile);
        list.stream().map(String::toCharArray).forEach(charArray -> {
            int sum = 0;
            for (char symbol : charArray){
                sum += symbol;
            }
            System.out.println(sum);
        });

    }
}
