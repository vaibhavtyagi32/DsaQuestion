import java.util.Scanner;

// Qs : 12+22+32+... print sum of series in range ?

public class SumOfSeries {
    static int sum(int n)
    {
        return(n=n*10+2);
    }
    public static void main(String[] args) {
        int s=0;
        System.out.println("Enter a range : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=sum(i);
            s=s+k;
        }
        System.out.println(s);
        sc.close();
        
    }
}
