import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char b = s.next().charAt(0);
        int c = s.nextInt();
        char d = s.next().charAt(0);

        if (a >= 19 && b == 'M' || c >= 19 && d == 'M') {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}