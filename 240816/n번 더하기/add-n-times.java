import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            a += n;
            System.out.println(a);
        }

    }
}