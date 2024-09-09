import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j-=2) {
                System.out.print(j + " * " + i + " = " + (i * j));
                if (j != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}