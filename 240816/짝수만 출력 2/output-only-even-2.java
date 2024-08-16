import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int a = s.nextInt();

        while (b >= a) {
            System.out.print(b+" ");
            b -= 2;
        }

    }
}