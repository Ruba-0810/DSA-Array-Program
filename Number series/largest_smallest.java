/*
enter no till user and at the end the program 
should dispaly the largest and smallest
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        boolean flag=true;
        while(flag){
            System.out.print("Enter the Integer:");
            int n=sc.nextInt();
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            System.out.println("1.repeat\n2.stop");
            int input=sc.nextInt();
            if(input==2){
                flag=false;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}