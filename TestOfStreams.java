import java.io.FileInputStream;
import java.io.IOException;

public class TestOfStreams {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Vasil\\IdeaProjects\\Streams, Files and Directories - Lab and Exercises\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int oneByte = inputStream.read();

        while (oneByte >= 0){
            System.out.print((char)oneByte);
            oneByte = inputStream.read();
        }
    }
}
