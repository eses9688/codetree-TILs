import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a += 87;
        b %= 10;
        System.out.println(a);
        System.out.println(b);
    }
}