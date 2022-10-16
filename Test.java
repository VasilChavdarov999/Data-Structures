public class Test {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 1){
                s=s+i;
                System.out.print(i + " ");
            }
        }
    }
}
