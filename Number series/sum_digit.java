/*
sum of digit
input:8624
output:20
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
             int last=n%10;
             sum+=last;
             n=n/10;
        }
        System.out.println(sum);
    }
}