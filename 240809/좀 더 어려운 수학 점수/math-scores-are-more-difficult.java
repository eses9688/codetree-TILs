import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        if (a == c) {
            if (b > d) {
                System.out.print("A");
            }
            else {
                System.out.print("B");
            }
        }
        else if(a > c) {
            System.out.print("A");
        }
        else {
            System.out.print("B");
        }

    }
}