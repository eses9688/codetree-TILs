import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <= n * 2; i++) {
            for (int j = 0; j <= n * 2; j++) {
                if (i == 0 || i % 2 == 0 || j == 0 || j % 2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}