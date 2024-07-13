package Recursion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(pali(123431));
    }
    static int reserve(int n){
    int arug=(int)(Math.log10(n))+1;
    return helper(n,arug);
}
    private static int helper(int n,int arug){
        if(n%10==0){
            return 0;
        }
        int remainder=n%10;
        return remainder*(int)(Math.pow(10,arug-1))+helper(n/10,arug-1);
    }
    static boolean pali(int n){
      return  n==reserve(n);
    }
}