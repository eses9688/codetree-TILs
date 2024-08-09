import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        
        if (m >= 12) {
            System.out.print("Winter");
        }
        else if (m >= 9) {
            System.out.print("Fall");
        }
        else if(m >= 6) {
            System.out.print("Summer");
        }
        else if(m >= 3) {
            System.out.print("Spring");
        }
        else {
            System.out.print("Winter");
        }
    }
}