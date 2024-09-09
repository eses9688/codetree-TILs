import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt+" ");
                    cnt++;
                }
                cnt++;
            }
            else {
                for (int j = cnt; j < cnt + n * 2; j+=2) {
                    System.out.print(j+" ");
                }
                cnt = cnt + n * 2 - 1;
            }
            System.out.println();
        }
    }
}