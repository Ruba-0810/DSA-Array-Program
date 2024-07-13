/*
1> Write a Java program to determine whether a given integer number is a Sunny number.
 A number is called a sunny number if the number next to the given number is 
 a perfect square. In other words, a number N will be a sunny number if N+1 is 
 a perfect square.
Example :  N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9.
 Hence 80 is a sunny number.
*/
import java.util.*;
class p22{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        boolean ruba=true;
        int sum=n+1;
        for(int i=1;i*i<=sum;i++){
            if(sum%i==0 && sum/i==i){
               ruba=true;
            break;
            }else{
                ruba=false;
            }
        }
        if(ruba){
            System.out.println("Sunny Number");
        }else{
            System.out.println("Is not Sunny Number");
        }
    }
}