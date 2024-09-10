import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == cnt) {
                    System.out.println(i + " * " + j + " = " + i * j);
                    break;
                }
                else {
                    System.out.print(i + " * " + j + " = " + i * j + " / ");
                }
            }
            cnt--;
        }        
    }
}