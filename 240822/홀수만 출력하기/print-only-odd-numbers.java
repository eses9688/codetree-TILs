import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = s.nextInt();
            if (a%2 == 1 && a%3 == 0) {
                System.out.println(a);
            }
        }

    }
}