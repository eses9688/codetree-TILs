import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int aver = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
            if ((i + 1) % 2 == 0) {
                sum += arr[i];
            }
            if ((i + 1) % 3 == 0) {
                aver += arr[i];
                cnt++;
            }
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", (double) aver / cnt);
    }
}