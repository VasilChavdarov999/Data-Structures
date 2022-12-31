import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        Path pathOfTheFile = Path.of("C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        long sum = 0;
        byte[] values = Files.readAllBytes(pathOfTheFile);
        for (byte value : values) {
            if (value == 10 || value == 13){
                continue;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
