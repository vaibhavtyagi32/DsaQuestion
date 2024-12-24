import java.util.*;
public class IsPrime {
    static void isprime1(int n) {
        int t = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                t = 0;
                break;
            }
        }
        if (t == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        isprime1(y);
        sc.close();
    }
}

