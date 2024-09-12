import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int result = 1;

            for (int j = a; j <= b; j++) {
                result *= j;
            }
            System.out.println(result);
        }       
    }
}