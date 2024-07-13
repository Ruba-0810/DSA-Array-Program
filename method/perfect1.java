
/*
WUTHOUT RANGE
*/
import java.util.*;
class p1{
    public static String perfectNumber(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            return "perfect number";
        }
        return "not perfect number";
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(perfectNumber(n));
   }
}