/*
Write a Java program to check whether the sum of the 
digits of a given number is equal to the product of the digits 
of the number.
       Description : 
              Input : 1124
              Output :  true
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
     int num=sc.nextInt();
     int sum=0;
     int mul=1;
     while(num>0){
        sum=sum+num%10;
        mul=mul*(num%10);
        num=num/10;
     }
     if(sum==mul){
        System.out.println("true");
     }else{
         System.out.println("false");
     }
    }
}