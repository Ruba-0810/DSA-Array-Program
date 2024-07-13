//decimal to binary
import java.util.*;
class p19{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        int pow=1;
        int sum=0;
        while(n>0){
            sum=sum+(n%2)*pow;
            pow=pow*10;
            n=n/2;
        }
        System.out.println(sum);
            }
}