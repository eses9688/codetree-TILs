import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int p = 1;

        for (int i = 1; i <= b; i++) {
            if (i % a == 0) {
                p *= i;
            }
        }
        System.out.print(p);

    }
}