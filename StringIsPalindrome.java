import java.util.*;
public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("palindorme");
        }
        else{
            System.out.println("not a palindorme");
        }
        sc.close();
    }
    
}
