import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if (n > 25) {
                System.out.println("Lower");
            }
            else if (n < 25) {
                System.out.println("Higher");
            }
            else {
                System.out.println("Good");
                break;
            }
        }
        
    }
}