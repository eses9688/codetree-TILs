import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                System.out.println("*");
            }
        }       
    }
}