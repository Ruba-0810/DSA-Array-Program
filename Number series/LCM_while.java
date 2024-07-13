import java .util.*;
class p11{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
         System.out.print("Enter a value:");
        int a=sc.nextInt();//first number
         System.out.print("Enter b value:");
        int b=sc.nextInt();//second number
         System.out.print("Enter c value:");
         int c=sc.nextInt();//second number
        int res=(a>b)?a:(b>c)?b:c;
        while(true){
            if(res%a==0 && res%b==0 && res%c==0){
                System.out.println(res);
                break;
            }
            res++;
        }

    }
}