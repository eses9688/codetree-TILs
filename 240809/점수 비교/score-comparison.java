import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        if (a > c && b > d) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}