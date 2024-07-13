import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
     int m=sc.nextInt();
     int n=sc.nextInt();
      int max=m>n?m:n;
      int GCD=1;
     for(int i=max;i>0;i--){
        if(m%i==0 && n%i==0){
            GCD=i;
            System.out.println(GCD);
            break;
        }
     }
    }
}
