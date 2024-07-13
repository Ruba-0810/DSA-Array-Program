import java.util.*;
class p1{
    public static String primeNumber(int n){
        boolean ruba=true;
        if(n==1 || n==0){
           ruba =false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                ruba=false;
                break;
            }
        }
        if(ruba){
            return "Prime";
        }
        return "Not prime";
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primeNumber(n));
    }
}