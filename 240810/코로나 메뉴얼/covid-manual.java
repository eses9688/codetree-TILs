import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int b = s.nextInt();
        char c = s.next().charAt(0);
        int d = s.nextInt();
        char e = s.next().charAt(0);
        int f = s.nextInt();

        if (a == 'Y' && b >= 37) {
            if (c == 'Y' && d >= 37 || e == 'Y' && f >= 37) {
                System.out.print("E");
            }
            else {
                System.out.print("N");
            }
        }
        else if (c == 'Y' && d >= 37) {
            if (a == 'Y' && b >= 37 || e == 'Y' && f >= 37) {
                System.out.print("E");
            }
            else {
                System.out.print("N");
            }
        }
        else if (e == 'Y' && f >= 37) {
            if (a == 'Y' && b >= 37 || c == 'Y' && d >= 37) {
                System.out.print("E");
            }
            else {
                System.out.print("N");
            }
        }
        else {
            System.out.print("N");
        }
    }
}