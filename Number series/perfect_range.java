//perfect number in range
import java.util.*;
class p16{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter start:");
        int start=sc.nextInt();
        System.out.print("Enter end:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            for(int j=1;j<num;j++){
                if(num%j==0)
                sum=sum+j;
            }
            if(sum==num){
                System.out.println(num+"it is perfect");
            }else{
                System.out.println(num+"is not perfect");
            }
        }
    }
}