/*
* Write a Java program to find the largest digit  in the given series of number.

Description :
Input : 12321
Output : 3
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int largest=num%10;
        num=num/10;
        while(num>0){
            int last_digit=num%10;
            if(largest<last_digit){
                largest=last_digit;
            }
            num=num/10;
        }
        System.out.println(largest);
    }
}