import java.util.Scanner;
public class PalindromeNo {
    static boolean plaindrome(int n){
        if(n<10){
            return true;
        }
        int r=reverse(n, 0);
        return n==r;
    }
    static int reverse(int n,int rev){
        if(n==0)
        {
            return rev;
        }
        int ld=n%10;
        rev=rev*10+ld;
        return reverse(n/10, rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int c=sc.nextInt();
        System.out.println(plaindrome(c));
        sc.close();
    }
}
