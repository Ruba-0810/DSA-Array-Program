/*
Write a program to check whether the entered 
number is prime number or not.

Test Case 1: 
	Input : 7
	Output : true

Test Case 2: 
	Input : 15
	Output : false

*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
     int num=sc.nextInt();
     int count=2;
     for(int i=2;i<num;i++){
        if(num%i==0){
            count++;
        }
     }
     if(count ==2){
        System.out.println("It is prime");
     }else{
        System.out.println("It is not prime");
     }
    }
}

