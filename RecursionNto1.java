import java.util.Scanner;

public class RecursionNto1 {
    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a range ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}