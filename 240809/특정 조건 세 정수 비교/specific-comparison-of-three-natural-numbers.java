import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d;

        if (a <= b && a <= c) {d = a;}
        else if (a <= b && a > c) {d = c;}
        else {d = b;}

        if (a == d) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

        if (a == b && a == c) {
            System.out.print(" "+1);
        }
        else {
            System.out.print(" "+0);
        }
    }
}