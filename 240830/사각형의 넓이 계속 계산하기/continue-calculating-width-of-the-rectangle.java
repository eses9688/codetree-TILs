import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();
            char c = s.next().charAt(0);
            System.out.println(a*b);
            if (c == 'C') {
                break;
            }
        }
        
        
    }
}