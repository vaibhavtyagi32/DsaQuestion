public class WordReverse {
    public static void main(String[] args) {
        String str="Welcome to java world";
        String[] splitArray =str.split(" ");
        for(int i=splitArray.length-1;i>=0;i--){
            System.out.print(splitArray[i]+" ");
        }
    }
}
