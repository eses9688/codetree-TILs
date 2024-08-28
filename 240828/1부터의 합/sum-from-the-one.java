import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int m = 0;
        
        for (int i = 1; i <= 100; i++) {
            sum += i;
            m = i;
            if (sum >= n) {
                break;
            }
        }
        System.out.println(m);
    }
}