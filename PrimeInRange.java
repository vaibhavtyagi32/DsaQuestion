import java.util.*;

public class PrimeInRange {
    static boolean PrimeInRange1(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a range ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime number in given range are : ");
        for (int j = 2; j <= n; j++) {
            if (PrimeInRange1(j)) {
                System.out.print(j+" ");
            }
        }
        sc.close();
    }
}
