import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            int n = s.nextInt();
            if (n%2 == 1) {
                continue;
            }
            System.out.println(n/2);
            cnt++;
            if (cnt >= 3) {
                break;
            }
        }   
    }
}