import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        double b = s.nextDouble();
        double c = s.nextDouble();
        System.out.println(a);
        System.out.printf("%.2f\n", b);
        System.out.printf("%.2f", c);
    }
}