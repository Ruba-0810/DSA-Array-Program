import java.util.*;
class p1{
    public static void neonNumber(int n){
        int square =n*n;
        int temp=square;
        int sum=0;
        while(square>0){
            sum=sum+square%10;
            square=square/10;
        }
        if(n==sum){
            System.out.println("It is neonNumber");
        }else{
             System.out.println("It not is neonNumber");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        neonNumber(n);
    }
}