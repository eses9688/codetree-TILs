import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt();
            if (a == 0) {
                break;
            }
            else {
                System.out.println(a);
            }
        }
        
    }
}