public class Main {
    public static void main(String[] args) {
        int a, b, c, tmp;
        a = 5;
        b = 6;
        c = 7;
        tmp = c;
        c = b;
        b = a;
        a = tmp;
        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}