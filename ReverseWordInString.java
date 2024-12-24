public class ReverseWordInString {
    public static void main(String[] args) {
        String s="welcome to java world";
        String[] sa=s.split(" ");
        for(int i=sa.length-1;i>=0;i--){
            System.out.print(sa[i]+" ");
        }
    }
}
