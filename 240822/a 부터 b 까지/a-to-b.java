import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i = a;

        System.out.print(i+" ");
        while (i < b) {
            if (i%2 == 1) {
                i *= 2;
            }
            else {
                i += 3;
            }
            if (i <= b) {
                System.out.print(i+" ");
            }
        }

    }
}