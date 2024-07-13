/*
Write a program to find all the 
prime numbers between a given range.
Constraints User needs to enter the range 
(lower bound and upper bound) where lower bound < upper bound and lower bound > 2. 
If these conditions are not satisfied then program 
should print Invalid range
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        if(start<2 ){
                System.out.println(start+" In valid");
             }
        
        for(int i=start;i<=end;i++){
            int num=i;
             boolean ruba=true;
             if(i==1 || i==0)
             {
                  ruba=false;
             }
             else
             {
                   for(int j=2;j<num;j++){
                      if(num%j==0){
                         ruba=false;
                         break;
                        }
                   }
             }
            if(ruba){
                System.out.println(num+" It is prime number");
                
            }
        }
    }
}