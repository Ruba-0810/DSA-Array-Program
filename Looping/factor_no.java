/*Write a program to find the factors for a given natural numbers.
Test Case 1: 
	Input : 9
	Output : 1,3,9

Test Case 2: 
	Input : 15 
	Output : 1,3,5,15
*/
import java.util.*;
class factor{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		System.out.print("Enter the n value");
		int n=sc.nextInt();
         int count=1;
		for(int i=1;i<n;i++){//here Im using n/2 but not using n to reduce the more complexity
			if(n%i==0){
				System.out.print(i+",");
				count++;
			}
		}
		 System.out.println(n);
		 System.out.println(count);
	}
}/*
n=36
1,2,3,4,6,9,12,18,36---we loop 34 loop
to reduce this n/2-->36/2=18 when it use this it will stop at 18 looping
*/