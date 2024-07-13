/*
with range
*/
import java .util.*;
class p1{
    public static void perfectnumberRange(int a,int b){
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;
            for(int j=1;j<num;j++){
                if(num%j==0){
                   sum=sum+j;
                }
            }
            if(sum==num){
                System.out.println(sum+"prefect");
            }
        }
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    perfectnumberRange(a,b);
  }
}