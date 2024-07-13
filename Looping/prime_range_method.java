/*
prime number in range by using method
*/

import java.util.*;
public class prime{
 static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int n=sc.nextInt();
         int m=sc.nextInt();
        for(int i=n;i<=m;i++){
        if(isPrime(i)){
           System.out.println(i+" it is prime number ");
        }else{
            System.out.println(i +" it not is prime number");
        }
        }
        
    }
    public static boolean isPrime(int num){
        int count=2;
        for(int i=2;i<num;i++){
            if(num%2==0){
               count++;
            }
        }
        return count==2;
        
    }
}