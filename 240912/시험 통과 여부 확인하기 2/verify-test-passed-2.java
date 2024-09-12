import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            double aver = 0;
            int[] grade = new int[4];
            for (int j = 0; j < 4; j++) {
                grade[j] = s.nextInt();
                sum += grade[j];
            }
            aver = (double) sum / 4;
            if (aver >= 60) {
                System.out.println("pass");
                cnt++;
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}