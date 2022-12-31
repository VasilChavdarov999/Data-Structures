import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortedLines {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        List<String> lines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        Files.write(Paths.get("sorted-lines.txt"), lines);

    }
}
