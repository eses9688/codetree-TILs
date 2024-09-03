import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}