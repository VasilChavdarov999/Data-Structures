import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            int oneByte = inputStream.read();
            while (oneByte != -1){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));

                oneByte = inputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
