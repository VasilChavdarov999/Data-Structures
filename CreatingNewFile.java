import java.io.File;
import java.io.IOException;

public class CreatingNewFile {
    public static void main(String[] args) throws IOException {

        File file = new File("creating-new-src-for-the-example-dir");

        if (!file.exists()){
            file.mkdir();
        }
    }
}
