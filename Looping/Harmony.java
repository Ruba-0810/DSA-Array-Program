/*
 * You are developing a biology learning application that 
 * introduces students to the concept of balance in numbers.
As part of an interactive quiz feature, you want to create a 
program that determines if a given number exhibits "Harmony."
Concept:
Harmonious Number: A positive integer N is classified as a 
Harmonious Number if the sum of its first and last digits equals 
the sum of its remaining digits.
Non-Harmonious Number: If the sum of the first and last digits 
does not equal the sum of the remaining digits, the number is 
classified as Non-Harmonious.
Example:
For input number 2468:
First digit and Last digit: 2,8
Remaining digits: 4, 6
Sum of first and last digits = 2 + 8 = 10
Sum of remaining digits = 4 + 6 = 10
Since the sum of first and last digits equals the sum of remaining
digits, 2468 is a Harmonious Number.
Test Case 1: 

	Input  : 1235
	Output : Harmony

Test Case 2: 

	Input  : 2468
	Output : Harmony

Test Case 3: 

	Input  : 9474
	Output : Non-Harmony



 */
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
     int num=sc.nextInt();
     int orginal=num;
     int sum1=0;//find last
     int sum2=0;
     sum1=sum1+num%10;// find last
     num=num/10;// remove last
     while(num>9){
       num=num/10;// find first
     }
      int ans1=sum1+num;//add last and first
      orginal=orginal/10;//remove last
      int ans2=0;
      while(orginal>9){// add balance first and last
        ans2=ans2+orginal%10;
        orginal=orginal/10;
      }
      if(ans1==ans2){
        System.out.println(" Harmony");
      }else{
         System.out.println("is not Harmony");
      }
    }
}