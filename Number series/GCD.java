//GCD
import java.util.*;
class p10{
     static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        //to find GCD we need  of TWO number
        System.out.print("Enter a value:");
        int a=sc.nextInt();//first number
         System.out.print("Enter b value:");
        int b=sc.nextInt();//second number
        int GCD=1;
        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                GCD=i;
            }
        }
         System.out.println("GCD of a and b:"+GCD);

    }
}