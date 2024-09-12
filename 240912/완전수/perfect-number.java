import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            int sum = 1;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j * j == i) {
                        sum += j; 
                    } else {
                        sum += j + i / j;
                    }
                }
            }
            if (sum == i && i != 1) { 
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}