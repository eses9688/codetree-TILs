import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
            if (arr[i] == 0) {
                cnt = i;
                break;
            }
            else {
                cnt = 10;
            }
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", (double) sum / cnt);
    }
}