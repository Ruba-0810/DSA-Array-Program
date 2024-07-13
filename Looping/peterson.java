/*
INPUT:145
1-->1
4-->1*2*3*4=24
5-->1*2*3*4*5=120
1+24+120=145
return true
*/
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int n=sc.nextInt();
        boolean ruba=isPetegon(n);
        System.out.println(ruba);
        
    }
    public static boolean isPetegon(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int last=n%10;
            int res=1;
            for(int i=1;i<=last;i++){
                  res=res*i;
            }
            sum=sum+res;
            n=n/10;
        }
        return sum==temp;
    }
}

        /*
        int sum=0;
        int temp=n;
        while(n>0){
            int last=n%10;
            int res=1;
            for(int i=1;i<=last;i++){
                  res=res*i;
            }
            sum=sum+res;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Peterson number");
        }else{
             System.out.println("is not Peterson number");
        }
    }
}
*/