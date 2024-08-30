import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean satisfied = true;
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            if (n % 3 == 0) {
                cnt++;
            }
        }
        if (cnt != 5) {
            satisfied = false;
        }
        if (satisfied == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        
    }
}