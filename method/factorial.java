import java.util.*;
class p1{

    public static int findFactorial(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                  fact=fact*i;
            }
            return fact;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n vamue:");
        int a=sc.nextInt();
        //int result=findFactorial(a);
        System.out.println(findFactorial(a));
    }
}