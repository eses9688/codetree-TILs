import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = s.next();
        }
        System.out.print(arr[1] + " " + arr[4] + " " + arr[7]);
        
    }
}