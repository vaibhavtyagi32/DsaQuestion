import java.util.*;
public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        int lastDigit=number%10;
        int a=(int)Math.log10(number);
        int firstDigit=number/(int)Math.pow(10,a);
        number=number%(int)Math.pow(10,a);
        number=number/10;
        number=lastDigit*(int)Math.pow(10,a)+number*10+ firstDigit;
        System.out.println(number);



        sc.close();
    }
}
