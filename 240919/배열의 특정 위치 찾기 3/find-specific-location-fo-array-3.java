import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int t = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
            if (arr[i] == 0) {
                t = i;
                break;
            }
        }
        sum = arr[t - 1] + arr[t - 2] + arr[t - 3];
        System.out.println(sum);
        
    }
}