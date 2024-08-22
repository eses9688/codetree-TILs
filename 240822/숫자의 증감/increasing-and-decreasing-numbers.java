import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        int n = s.nextInt();

        if (c == 'A') {
            for (int i = 1; i <= n; i++) {
                System.out.print(i+" ");
            }
        }
        else if (c == 'D') {
            for (int i = n; i >= 1; i++) {
                System.out.print(i+" ");
            }
        }

    }
}