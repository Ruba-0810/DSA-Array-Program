//binary into deciaml
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int binary=sc.nextInt();
        int pow=1;
        int sum=0;
        while(binary>0){
           sum=sum+(binary%10)*pow;
           pow=pow*2;
           binary=binary/10;
           }
           System.out.println(sum);
    }
}