public class Print10Time {
    static void print(String k,int a)
    {
        if(a==0){
            return;
        }
        System.out.println(k);
        print(k,a-1);
    }
    public static void main(String[] args) {
        print("hello",10);
    }
}
