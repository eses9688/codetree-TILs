import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}