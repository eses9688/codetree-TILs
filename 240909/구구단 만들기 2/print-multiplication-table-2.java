import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int cnt;

        for (int i = 2; i < 10; i+=2) {
            cnt = 0;
            for (int j = b; j >= a; j--) {
                System.out.print(j + " * " + i + " = " + (i * j));
                cnt++;
                if (cnt != b - a + 1) {
                    System.out.print(" / ");
                }
            }
            
            System.out.println();
        }
    }
}