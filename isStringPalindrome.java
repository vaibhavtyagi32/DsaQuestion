public class isStringPalindrome {
    public static void main(String[] args) {
        String str="racecar";
        int t=1;
        int j=str.length()-1;
        for(int i=0;i>j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                t=0;
                break;
            }
        }
        if(t==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a plaindrome");
        }
    }
}
