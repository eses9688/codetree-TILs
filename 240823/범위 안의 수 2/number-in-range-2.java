import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = s.nextInt();
            if (n >= 0 && n <= 200) {
                sum += n;
                cnt++;
            }
        }
        System.out.print(sum+" ");
        System.out.printf("%.1f", (double)sum/cnt);
    }
}