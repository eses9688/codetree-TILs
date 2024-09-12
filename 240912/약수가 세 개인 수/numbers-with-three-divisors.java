import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int res = 0;

        for (int i = start; i <= end; i++) {
            int cnt = 1;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 3) { 
                res++;
            }
        }
        System.out.println(res);
    }
}