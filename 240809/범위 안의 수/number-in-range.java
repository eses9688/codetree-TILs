import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a >= 10 && a <= 20) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}