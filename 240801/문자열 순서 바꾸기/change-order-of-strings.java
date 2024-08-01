import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println(a);
        System.out.println(b);
    }
}