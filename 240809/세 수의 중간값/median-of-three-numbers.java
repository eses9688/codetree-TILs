import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (b > a && b < c) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}