import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        while (n != 1) {
            n /= 2;
            cnt++;
        }        
        System.out.println(cnt);
    }
}