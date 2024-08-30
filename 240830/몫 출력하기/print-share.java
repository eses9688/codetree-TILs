import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int n = s.nextInt();
            if (n%2 == 0) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println(n/2);
                    break;
                }
            }
            else {
                continue;
            }
        }
    }
}