public class PathExample {
    public static void main(String[] args) {
        String filePath = "input.txt";
        String dir = System.getProperty("user.dir");

        System.out.println(dir + "\\" + filePath);
    }
}
