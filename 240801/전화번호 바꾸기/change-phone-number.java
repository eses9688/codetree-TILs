import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("-");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("010"+"-"+c+"-"+b);
    }
}