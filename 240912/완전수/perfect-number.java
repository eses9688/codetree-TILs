import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int sum = 1;
        int cnt = 0;

        for (int i = 2; i * i < end && sum <= end; i++) {
            if (end % i == 0) { 
                sum += i + end / i; 
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}