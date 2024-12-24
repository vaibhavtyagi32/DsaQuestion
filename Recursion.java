public class Recursion {
    static void printdec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    static void printinc(int n){
        if(n==0){
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumNaturalnumber(int n){
        if(n==0)
        {
            return 0;
        }
        return n+sumNaturalnumber(n-1);

    }
    static int fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int f=fib(n-1)+fib(n-2);
        return f;
    }
    public static void main(String[] args) {
        printdec(10);
        System.out.println("");
        printinc(5);
        System.out.println("");
        int fact=factorial(5);
        System.out.println(fact);
        System.out.println(sumNaturalnumber(10));
        System.out.println(fib(5));
    }
}
