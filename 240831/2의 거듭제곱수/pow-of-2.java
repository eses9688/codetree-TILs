import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 1;
        while (n != 1) {
            n /= n;
            cnt++;
        }        
        System.out.println(cnt);
    }
}