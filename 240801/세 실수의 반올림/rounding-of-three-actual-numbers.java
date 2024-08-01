import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        System.out.printf("%.3f\n", a);
        System.out.printf("%.3f\n", b);
        System.out.printf("%.3f", c);
    }
}