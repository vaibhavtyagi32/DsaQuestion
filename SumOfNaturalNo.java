import java.util.Scanner;

public class SumOfNaturalNo {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
        return n+sum(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter a range ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum is : "+sum(n));
        sc.close();
    }
}
