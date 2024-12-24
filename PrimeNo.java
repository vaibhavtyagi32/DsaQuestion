import java.util.Scanner;
public class PrimeNo {
    static boolean prime(int n,int i){
        if(n==0 || n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if (n%i==0){
            return false;
        }
        if(i*i>n)
        {
            return true;

        }
        return prime(n, i+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        System.out.println(prime(n,2));
        sc.close();
    }
}
