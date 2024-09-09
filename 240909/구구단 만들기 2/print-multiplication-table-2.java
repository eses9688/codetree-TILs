import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = 2; i < 10; i+=2) {
            for (int j = b; j >= b - a; j--) {
                System.out.print(j + " * " + i + " = " + (i * j));
                if (j != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}