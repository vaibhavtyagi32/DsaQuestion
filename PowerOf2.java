public class PowerOf2 {
    static boolean powerof2(int n)
    {
        if(n==0)
        {
            return false;
        }
        if(n==1){
            return true;
        }
        // float m=n/2;
        // return powerof2(m);
        if(n%2 != 0){
            return false;
        }
        return powerof2(n/2);
        
    }
    public static void main(String[] args) {
        System.out.println(powerof2(32));
    }
}
