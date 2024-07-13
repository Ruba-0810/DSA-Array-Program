//prime in range
import java.util.*;
class p22{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter the start:");
        int start=sc.nextInt();
         System.out.print("Enter the end:");
        int end=sc.nextInt();
        
        for(int i=start;i<=end;i++){
            int num=i;
            boolean ruba=true;
            if(num==1 || num==0){
            ruba=true;
            }
            else{
                for(int j=2;j<num;j++){
                    if(num%j==0){
                        ruba=false;
                        break;
                    }
                }
            }
            if(ruba){
                System.out.println(num+"prime");
            }
        }
    }
}