import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d;

        if (a >= b) {
            if (a >= c) d = a;
            else d = c;
        }
        else {
            if (b >= c) d = b;
            else d = c;
        }

        System.out.print(d);
    }
}