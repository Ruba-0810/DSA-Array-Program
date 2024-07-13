
/*
USING FOR LOOP
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
class p1{
    public static String palindrome(int n){
        int sum=0;
        for(int i=n;i>0;i=i/10){
           sum=(sum*10)+i%10;
        }
        if(sum==n){
            return "Palidrome";
        }
            return " not palidrome";
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        String result=palindrome(n);
        System.out.println(result);
    }
}