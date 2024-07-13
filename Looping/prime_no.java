//Write a java program to print count of prime numbers...
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter n:");
        int m=sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            int num=i;
            boolean ruba=true;
            if(num==1||num==0){
                  ruba=false;
            }
            else{
                for(int j=2;j<num;j++){
                    if(num%j==0){
                        ruba=false;
                        break;
                    }
                }
            }
             if(ruba)
         {
          count++;
         }
        }
        System.out.println(count);
    }
}