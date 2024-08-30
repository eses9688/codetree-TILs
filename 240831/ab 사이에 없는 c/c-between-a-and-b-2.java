import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean satisfied = true;
        
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                satisfied = false;
            }
        }
        if (satisfied = false) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}