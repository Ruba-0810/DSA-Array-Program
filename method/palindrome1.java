/*

/*
USING WHILE LOOP
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
    public static String palidromeNew(int n){
        int sum=0;
        int i=n;
        while(i>0){
            sum=sum*10+i%10;
            i=i/10;
        }
        if(sum==n){
            return "palidrome";
        }
        return "not palidrome ";
    } 
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println(palidromeNew(n));
    }
}