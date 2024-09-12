import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double aver = 0;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
            if (arr[i] >= 250) {
                sum -= arr[i];
                aver = (double) sum / i;
                break;
            }
        }        
        if (aver != 0) {
            System.out.print(sum + " ");
            System.out.printf("%.1f", aver);
        }
        else {
            System.out.print(sum + " ");
            System.out.printf("%.1f", (double) sum / 10);

        }

    }
}