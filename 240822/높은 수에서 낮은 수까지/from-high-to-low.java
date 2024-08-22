import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a >= b) {
            for (int i = a; i >= b; i--) {
                System.out.print(i+" ");
            }
        }
        else {
            for (int j = b; j >= a; j--) {
                System.out.print(j+" ");
            }
        }

    }
}