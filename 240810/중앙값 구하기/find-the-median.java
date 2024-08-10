import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int m;

        if (a > b && a > c) {
            if (b > c) {
                m = b;
            }
            else {
                m = c;
            }
        }
        else if (b > a && b > c) {
            if (a > c) m = a;
            else m = c;
        }
        else {
            if (a > b) m = a;
            else m = b;
        }
        System.out.print(m);

    }
}