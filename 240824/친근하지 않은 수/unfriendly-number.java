import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i%2 == 0 || i%3 == 0 || i%5 == 0) {
                continue;
            }
            count++;
        }
        System.out.print(count);
    }
}