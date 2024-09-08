import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cnt + " ");
                cnt += 2;
                if (cnt / 10 >= 1) {
                    cnt = 2;
                }
            }
            System.out.println();
        }
    }
}