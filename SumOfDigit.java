import java.util.*;
public class SumOfDigit {
    static int Sum(int n){
        if(n<=0)
        {
            return 0;
        }
        int r=n%10;
        int f=r+Sum(n/10);
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        System.out.println(Sum(n));
        sc.close();
    }
}
