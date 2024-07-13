/*
Write a Java Program to print the Factorial of the given number.
Test Case 1: 
	Input : 3
	Output : 6

Test Case 2: 
	Input : 5
	Output : 120

Test Case 3: 
	Input : 9
	Output : 362880
*/
import java.util.*;
class Factorial{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        System.out.println(res);

    }
}