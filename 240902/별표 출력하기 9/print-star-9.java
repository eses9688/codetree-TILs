import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }    
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }              
            System.out.println();
        }        
    }
}