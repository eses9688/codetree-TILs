import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a == 0) {
            if (b >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else {
            if (b >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }

    }
}