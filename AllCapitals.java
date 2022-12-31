import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        Path pathOfTheFileInput = Path.of("C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        Path pathOfTheFileOutput = Path.of("C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        List<String> list = Files.readAllLines(pathOfTheFileInput);

        File outputFile = new File(String.valueOf(pathOfTheFileOutput));
        PrintWriter writer = new PrintWriter(outputFile);

        list.forEach(line -> writer.println(line.toUpperCase()));
        writer.close();

    }
}
