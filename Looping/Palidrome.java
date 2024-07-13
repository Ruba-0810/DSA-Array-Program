/*
A palindrome is a word, sentence, verse, or even number 
that reads the same backward or forward.

Input : 12321
Reverse of the given number: 12321
The input and reverse number are same so it's called Palindrome

Test Case 1: 
	Input : 8767 
	Output : false

Test Case 2: 
	Input : 985589
	Output : true

Test Case 3: 
	Input : 65298
	Output : false
*/
import java.util.*;
class p21{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            sum=sum*10+n%10;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("palidrome");
        }else{
             System.out.println("is not palidrome");
        }
    }
}