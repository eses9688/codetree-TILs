import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 1;

        while (n/d > 1) {
            n /= d;
            d++;
        }
        System.out.println(d);
    }
}