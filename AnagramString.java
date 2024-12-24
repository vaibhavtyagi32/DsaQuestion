import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1="java";
        String s2="avaj";
        System.out.println("two string are anagram "+checkanagarm(s1,s2));
    }
    public static boolean checkanagarm(String s1,String s2){
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
        
    }
}
