/*
Write a Java program to determine whether a given integer is a Duck number or not. 
A Duck number is a positive, non-zero number that contains at least one zero in it.
Example:
3210 is a Duck number because it contains a zero at the end of the number.
8237 is not a Duck number because it does not contain zero in it.
*/
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int n=sc.nextInt();
        boolean ruba=false;
        while(n>=0){
            if(n%10==0){
               ruba=true;
               break;
            }
              n=n/10;
        }
        if(ruba){
            System.out.println("Duck Number");
        }else{
             System.out.println("Is not Duck Number");
        }
} 
}
