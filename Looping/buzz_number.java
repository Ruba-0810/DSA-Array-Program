/*
Write a java program to find whether the given 
integer number in Buzz number or not. Buzz number is a number 
that ends with digit 7 or divisible by 7.
Example :  42 is a Buzz number because it is divisible by 7.
107 is a Buzz number because it ends with 7.
*/
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int n=sc.nextInt();
        int check=n%10;
        if(n%7==0 || check%7==0){
            System.out.println("Buzz number");
        }
        else if(check==0 && n%7!=0){
            System.out.println("Is not Buzz number"); 
        }
        else{
            System.out.println("Is not Buzz number");
        }
       
    }
}
