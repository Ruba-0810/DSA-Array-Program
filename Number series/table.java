//table
import java.util.*;
class p2{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the n value");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
         System.out.println( i+"X"+n+"="+(i*n));
    }
}