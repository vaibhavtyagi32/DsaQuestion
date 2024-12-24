import java.util.Scanner;

public class ReverseString {
    static String reverse(String s,int i)
    {
        if(i==-1)
        {
            return s;
        }
        return reverse(s.substring(1) + s.charAt(0),i-1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String :");
        String n=sc.next();
        System.out.println(reverse(n,n.length()-1));
        sc.close();
    }
}
