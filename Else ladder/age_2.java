/*
If the ages of Ram, Shyam and Ajay are input through the keyboard, 
write a program to determine the youngest of the three[Ram, Shyam two  have same age]

*/
import java.util.*;
class program7{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the age1:");
        int age1=sc.nextInt();
        System.out.print("Enter the age2:");
        int age2=sc.nextInt();
        System.out.print("Enter the age3:");
        int age3=sc.nextInt();//a=2 b=2 c=1
        if(age1==age2 && age1>age3)
        System.out.println("age3");
        else if(age2==age3 && age2>age1)
        System.out.println("age1");
        else
         System.out.println("age2");





    }
}