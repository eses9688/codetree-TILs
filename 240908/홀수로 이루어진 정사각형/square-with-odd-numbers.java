import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j+=2) {
                System.out.print(11 + (i * 2) + j + " ");
            }
            System.out.println();
        }
        
    }
}