import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 2 * (n - i) - 1; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }        
    }
}