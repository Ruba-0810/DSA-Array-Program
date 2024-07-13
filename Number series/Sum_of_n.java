//sum of all n
import java.util.*;
class p12{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            //without formula
            sum=sum+i;
            //with formula
            sum=n*(n+1)/2;
        }
        System.out.println(sum);
    }
}