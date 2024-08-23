import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a%2 == 1 && a%3 == 0) {
                sum += a;
            }
        }
        System.out.print(sum);

    }
}