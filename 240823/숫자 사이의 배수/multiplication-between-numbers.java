import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
        int cnt = 0;
        double avr;

        for (int i = a; i <= b; i++) {
            if (i%5 == 0 || i%7 == 0) {
                sum += i;
                cnt++;
            }
        }
        System.out.print(sum+" ");
        System.out.printf("%.1f", (double)sum/cnt);

    }
}