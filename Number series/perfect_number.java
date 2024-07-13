//perfect number 
import java.util.*;
class p15{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Is perfect number");
        }else{
            System.out.println("Is  not perfect number");
        }
    }
}