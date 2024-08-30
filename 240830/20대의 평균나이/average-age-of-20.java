import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true) {
            int n = s.nextInt();
            if (n >= 20 && n < 30) {     
                sum += n;
                cnt++;
                continue;
            }
            else {
                break;
            }
        }
        System.out.printf("%.2f", (double)sum/cnt);
    }
}