import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;

        while (true) {
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
                cnt++;
            }
            else {
                n *= 3;
                n += 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}