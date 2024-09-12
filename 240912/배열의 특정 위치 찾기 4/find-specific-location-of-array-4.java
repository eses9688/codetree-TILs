import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 == 0) {
                cnt++;
                sum += arr[i];
            }
            if (arr[i] == 0) {
                cnt -= 1;
                break;
            }
        }
        System.out.print(cnt + " " + sum);
    }
}