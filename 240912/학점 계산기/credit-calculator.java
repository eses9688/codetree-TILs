import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextDouble();
            sum += arr[i];
        }
        double grade = (double) sum / n;
        System.out.printf("%.1f", grade);
        System.out.println();
        if (grade >= 4.0) {
            System.out.println("Perfect");
        }
        else if (grade >= 3.0) {
            System.out.println("Good");
        }
        else {
            System.out.println("Poor");
        }
        
    }
}