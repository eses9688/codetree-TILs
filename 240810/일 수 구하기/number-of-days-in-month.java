import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n <= 7 && n != 2) {
            if (n%2 == 0) {
                System.out.print(30);
            }
            else {
                System.out.print(31);
            }
        }
        else if (n > 7) {
            if (n%2 == 0) {
                System.out.print(31);
            }
            else {
                System.out.print(30);
            }
        }
        else {
            System.out.print(28);
        }

    }
}