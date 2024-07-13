//prime
import java.util.*;
class p21{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        String ruba ="prime";
            if(n==1 || n==0){
                ruba="neither prime nor";
            }
            else {
                for(int i=2;i<n;i++){
                if(n%2==0){
                ruba="not prime";
                break;
               }
            }
        }
        System.out.println(ruba);
    }
}