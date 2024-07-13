//factorial in range
import java.util.*;
class p14{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter start:");
        int start=sc.nextInt();
        System.out.print("Enter end:");
         int end=sc.nextInt();
         for(int i=start;i<=end;i++){
            long num=i;
            long res=1l;
            for(int j=1;j<=num;j++){
                res=res*j;
            }
            System.out.println(num+" : "+res);
         }
    }
}