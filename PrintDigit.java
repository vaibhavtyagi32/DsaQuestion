import java.util.*;
public class PrintDigit {
    static void digit(int n)
    {
        if(n<=0)
        {
            return;
        }
        int r=n%10;
        digit(n/10);
        System.out.print(r+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int c=sc.nextInt();
        digit(c);
        sc.close();
    }
}
