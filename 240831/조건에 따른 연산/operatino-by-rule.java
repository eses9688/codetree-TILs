import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        while (n < 1000) {
            if (n % 2 == 0) {
                n = n * 3 + 1;
                cnt++;
            }
            else {
                n = n * 2 + 2;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}