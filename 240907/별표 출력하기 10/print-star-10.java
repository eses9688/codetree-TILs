import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n * 2; i++) {
            if (i%2 == 1) {
                for (int j = 1; j <= 1+(i/2); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int k = 1; k <= n - (i - 1) / 2; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}