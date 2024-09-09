import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = n + 1;

        for (int i = 1; i <= n; i++) {
            int ini = i;

            for (int j = 1; j <= n; j++) {
                System.out.print(ini);
                ini = sum - ini;
            }
            System.out.println();
        }
    }
}