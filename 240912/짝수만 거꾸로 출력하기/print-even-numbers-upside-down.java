import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 == 0) {
                arr2[cnt] = arr[i];
                cnt++;
            }
        }
        for (int j = cnt - 1; j >= 0; j--) {
            System.out.print(arr2[j] + " ");
        }
        
    }
}