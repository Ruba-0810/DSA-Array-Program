package Recursion;

public class Count_Step {
    public static void main(String[] args) {

        System.out.println(step(41));
    }
    static int step(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int remainder=n%10;
        if(remainder==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }
}
