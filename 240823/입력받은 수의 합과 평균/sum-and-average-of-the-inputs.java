import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            sum += a;
        }
        System.out.print(sum+" ");
        System.out.printf("%.1f", (double)sum/n);
    }
}