
/*
 * 
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153

 */
import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
       while(n>0){
        count++;
        n=n/10;
       } 
       int sum=0;
       int temp=n;
       while(temp>0){
         int last=temp%10;
         while(count>0){
           sum=sum+last;
           count--;
         }
         temp=temp/10;
       }
       if(sum==n){
        System.out.println("Armstrong number");
       }else{
        System.out.println("Is not Armstrong number");
       }
    }
}
