import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while (n >= 1) {
            System.out.print(n+" ");
            n--;
        }
    }
}