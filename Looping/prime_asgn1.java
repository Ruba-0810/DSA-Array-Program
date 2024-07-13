/*
Write a program to find count of prime numbers present between a 
given range Constraints User needs to enter the range (lower bound and upper bound) 
where lower bound upper bound and lower bound > 2 If these conditions are not 
satisfied then program should print Invalid range
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start<2){
            System.out.println("Invalid");
        }
        else{
            int count=0;
            for(int i=start;i<=end;i++){
                boolean ruba=true;
                int num=i;
               for(int j=2;j<num;j++){
                  if(num%j==0){
                       ruba=false;
                  }
               }
               if(ruba){
                count++;
              }
            }
            System.out.println(count);
        }
    }
}