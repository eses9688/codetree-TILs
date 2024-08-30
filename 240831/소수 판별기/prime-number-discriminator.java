import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean satisfied = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                satisfied = false;
            }
        }
        if (satisfied == true) {
            System.out.println("P");
        }
        else {
            System.out.println("C");
        }
    }
}