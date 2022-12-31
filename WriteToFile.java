import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException{ // това е Input Output Exception

        //къде работи системата ни:
        Properties properties = System.getProperties();

        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        int read = inputStream.read();
        Set<Character> punctuations = Set.of(',', '.', '!', '?');


       while (read != -1){
           char symbol = (char)read;
           if (!punctuations.contains((char) read)){
               outputStream.write(read);
           }
           read = inputStream.read();
       }
    }
}
