//LCM
import java .util.*;
class p11{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
         System.out.print("Enter a value:");
        int a=sc.nextInt();//first number
         System.out.print("Enter b value:");
        int b=sc.nextInt();//second number
        int LCM=1;
        for(int i=2;i<=a && i<=b ;i++){
            if(a%i==0 && b%i==0){
                LCM=i;
               break;

            }
        }
       System.out.println(LCM);
    }

}