/* USING METHOD
 * Design a Java program that checks if a given number is a "Symmetric Power Number." 
A Symmetric Power Number is defined as a positive integer with an even number of digits that can be divided exactly into two equal parts from the middle. When these two parts are summed and the result is squared, it should equal the original number itself.
Write the Java program to implement this concept. Ensure that the program:
Prompts the user to enter a positive integer.
Determines if the entered number qualifies as a Symmetric Power Number based on the described criteria.
Prints whether the number is a Symmetric Power Number or not.
Example:
Input :2025 
After the split of the number in 2 half and addition the Sum is 45 and Square of it is 2025
Output :"Symmetric Power Number."

Test Case 1: 

	Input  : 2025
	Output : "Symmetric Power Number."

Test Case 2: 

	Input  : 2468
	Output :  "Not-Symmetric Power Number."

Test Case 3: 

	Input  : 13123
	Output : "Invalid Number”
*/
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int n=sc.nextInt();
        //s1 find length
        int count=0;
        while(n>0){
             n=n/10;
             count++;
        }
        if(count%2==0){
            int temp=n;
            int s1=0;
           for(int i=1;i<=count/2;i++){
               s1=s1*10+n%10;
               n=n/10;
           }
           int n1=0;
           while(s1>0){
            n1=n1*10+s1%10;
            s1=s1/10;
           }
           int sum=n+s1;
           int square=sum*sum;
           if(temp==square){
            System.out.println("Symmetric power number");
           }else{
            System.out.println("is not Symmetric power number");
           }


        }else{
            System.out.println("Invalid");
        }
    }
}