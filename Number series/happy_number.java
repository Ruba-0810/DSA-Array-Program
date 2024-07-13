//happy number
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter number:");
        int `ans=sc.nextInt();
        String ruba="unhappy";
    if(ans==1){
        ruba="happy";
    }
    else{
      while(ans!=1 && ans!=4){
        int sum=0;
        int num=ans;
            while(num>0){
                sum=sum+(num%10)*(num%10);
                num=num/10;
            }
                ans=sum;
            if(ans==1){
               ruba="happy";
                break;
            }
       }
     }
     System.out.println(ruba);
    }
}