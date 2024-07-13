package Recursion;

public class Factor {
    public static void main(String[] args) {
        System.out.println(factornumber(5));
    }
    static int factornumber(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factornumber(n-1);          //here it ir return function
    }
}
