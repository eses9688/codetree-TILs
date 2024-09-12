import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            int n = s.nextInt();
            int cnt = 0;

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    cnt++;
                }
                else {
                    n = n * 3 + 1;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
}