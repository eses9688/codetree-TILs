import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
        int t;

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        for (int i = a; i <= b; i++) {
            if (i%5 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}