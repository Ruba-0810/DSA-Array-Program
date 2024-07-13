//power
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        //x2
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println(ans);
    }
}