/*
Write a Java program to Find the sum and product of each 
digit of the given integer number .
Description : 
        Input : 7645
        Output :    
        Sum : 22
        Product  :  840
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
     System.out.println(sum);
     System.out.println(mul);
    }
}