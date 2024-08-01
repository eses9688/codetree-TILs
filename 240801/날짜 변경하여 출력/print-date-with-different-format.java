import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\.");
        int y = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        System.out.println(m+"-"+d+"-"+y);
    }
}