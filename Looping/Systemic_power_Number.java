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
class p21{
    public static int inlength(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    private static int findn2(int n,int length){
        int n2=0;
           for(int i=1;i<=length/2;i++){
              n2=n2*10+n%10;
              n=n/10;
           }
           return reverse(n2);
    }
    private static int reverse(int n){
         int n2=0;
         while(n>0){
            n2=n2*10+n%10;
            n=n/10;
         }
        return n2;
    }
    private static int findn1(int n,int length){
       for(int i=1;i<=length/2;i++){
         n=n/10;
       }
       return n;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        // S1create length method
        int length=inlength(n);
        if(length%2==0){
        // S2 find n1 and n2
        int find_n2=findn2(n,length);
        int find_n1=findn1(n,length);
        int sum=find_n1+find_n2;
        int res=sum*sum;
          if(res==n){
            System.out.println("Symmetric Number");
          }else{
             System.out.println("Is not Symmetric Number");
          }
        }else{
            System.out.println("Invalid Number");
        }

    }
}