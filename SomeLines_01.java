import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SomeLines_01 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Exercise\\" +
                "New folder\\stream";
        File file = new File(path);
        file.createNewFile();

        PrintWriter writer = new PrintWriter(file);
        writer.println("Java Advanced");
        writer.println("Today is 30 december");
        writer.close();

    }
}
