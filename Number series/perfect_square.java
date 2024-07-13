//perfect square in range
import java.util.*;
class p23{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter the start:");
        int start=sc.nextInt();
        System.out.print("Enter the end:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int num=i;
            for(int j=1;j*j<=num;j++){
                if(num%j==0 && num/j==j){
                  System.out.println(num+"perfect");
                }
            }
        }
    }
}
