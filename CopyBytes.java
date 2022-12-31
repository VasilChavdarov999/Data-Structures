import java.io.*;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "input.txt";

        try{

            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            int read = inputStream.read();
            PrintWriter printWriter = new PrintWriter(outputStream);

            while (read != -1){
                if (read == 32){
                    printWriter.print(' ');
                } else if (read == 10){
                  printWriter.println();
                } else {
                    printWriter.print(read);
                }
                read = inputStream.read();
            }
            printWriter.close();
        }catch (IOException ignored){

        }
    }
}
