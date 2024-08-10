import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;

        for (int i = 0; i < 5; i++) {
            System.out.print(n+" ");
            n += a;
        }

    }
}