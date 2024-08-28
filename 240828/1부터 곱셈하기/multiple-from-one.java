import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mul = 1;
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            mul *= i;
            m = i;
            if (mul >= n) {
                break;
            }
        }
        System.out.println(m);
        
    }
}