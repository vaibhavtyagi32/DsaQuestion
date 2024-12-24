import java.util.*;
public class EvenOddRecursion {
    static void EvenOdd(int n)
    {
        if(n<=0)
        {
            return;
        }
        EvenOdd(n-1);
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range : ");
        int k=sc.nextInt();
        EvenOdd(k);
        sc.close();
    }
}
