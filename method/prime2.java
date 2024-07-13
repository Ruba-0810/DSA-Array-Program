import java.util.*;
class p1{
    public static void primeRange(int a,int b){

        for(int i=a;i<=b;i++){
            int num=i;
            boolean ruba=true;
            if(num==1 || num==0){
                ruba=false;
            }else{
                for(int j=2;j<num;j++){
                if(num%j==0){
                   ruba=false;
                }
             }
            }
            if(ruba){
                System.out.println(num+" Prime");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        primeRange(a,b);
    }
}