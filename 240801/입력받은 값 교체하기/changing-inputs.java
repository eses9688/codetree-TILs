import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, tmp;
        a = s.nextInt();
        b = s.nextInt();
        tmp = a;
        a = b;
        b = tmp;
        System.out.println(a+" "+b);
    }
}