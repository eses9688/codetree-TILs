import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b;
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.printf("%.2f", a+b);
    }
}