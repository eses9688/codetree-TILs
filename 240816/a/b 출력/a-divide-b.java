import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print(a/b+".");
        a %= b;
        for (int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a/b);
            a %= b;
        }
    }
}