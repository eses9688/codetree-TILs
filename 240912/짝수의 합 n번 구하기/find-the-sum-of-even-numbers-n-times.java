import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int sum = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }        
    }
}