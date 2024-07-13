/*
If the ages of Ram, Shyam and Ajay are input through the keyboard, 
write a program to determine the youngest of the three

*/
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the age1:");
        int age1=sc.nextInt();
        System.out.print("Enter the age2:");
        int age2=sc.nextInt();
        System.out.print("Enter the age3:");
        int age3=sc.nextInt();
        if(age1>age2 && age2>age3)
        System.out.println("age3 is youngest one");
        else if(age1>age2)
        System.out.println("age2 is youngest one");
        else
        System.out.println("age1 is youngest one");


    }
}